package com.ashishlakhmani.emailsender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendClick(View view) {
        EditText subject = (EditText) findViewById(R.id.subject);
        EditText message = (EditText) findViewById(R.id.message);
        EditText to = (EditText) findViewById(R.id.to);

        if (!to.getText().toString().isEmpty()) {
            BackgroundTask backgroundTask = new BackgroundTask(this);
            backgroundTask.execute(subject.getText().toString(), message.getText().toString(), to.getText().toString());
        } else {
            Toast.makeText(this, "Please Enter the Email ID.", Toast.LENGTH_SHORT).show();
        }
    }
}
