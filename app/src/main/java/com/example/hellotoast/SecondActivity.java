package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.MessageReceived);

        if (message != null && !message.isEmpty()) {
            textView.setText(message);
        }

    }

    public void launchMainActivity(View view) {
        EditText editText = findViewById(R.id.SendReply); // Assuming you have a TextView with id 'textView'
        String message = editText.getText().toString();// Hardcoded message

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("EXTRA_MESSAGE", message); // Pass the message as an extra
        startActivity(intent);
    }
}