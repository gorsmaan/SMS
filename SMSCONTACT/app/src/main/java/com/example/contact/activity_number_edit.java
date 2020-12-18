package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_number_edit extends AppCompatActivity {

    SmsManager smsManager;
    EditText number;
    Button send;
    Intent intent;
    TextView text;
    String messageText;

    public static final String SEND_TEXT = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_edit);
        intent = getIntent();
        smsManager = SmsManager.getDefault();
        text = findViewById(R.id.textView2);
        send = findViewById(R.id.button);
        number = findViewById(R.id.editTextPhone);
        getSupportActionBar().setTitle("МОЖЕТ ВЗИМАТЬСЯ ПЛАТА!");

    }
    public void onClickSend(View view) {
        messageText = intent.getStringExtra(SEND_TEXT);
        String textnumber = String.valueOf(number.getText());
        smsManager.sendTextMessage(textnumber, null, messageText, null, null);
        finish();
    }
}