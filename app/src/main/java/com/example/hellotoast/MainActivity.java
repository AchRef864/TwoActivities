package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.ReplyReceived);
        TextView textView4 = findViewById(R.id.textView4);

        if (message != null) {
            textView.setText(message);
        } else {
            textView.setVisibility(View.GONE);
            textView4.setVisibility(View.GONE);
        }
    }

    public void launchSecondActivity(View view) {
        EditText editText = findViewById(R.id.SendMessage);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }

}