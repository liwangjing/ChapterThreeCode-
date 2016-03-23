package com.example.jing.chapterthree;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends Activity{

    private EditText userText;
    private EditText passwordText;
    private Button logInButton;
    private Button cancelButton;
    private int count=0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);

        userText = (EditText)findViewById(R.id.userText);
        passwordText = (EditText)findViewById(R.id.passwordText);
        logInButton = (Button)findViewById(R.id.logIn);
        cancelButton = (Button)findViewById(R.id.cancel);

        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                AlertDialog.Builder dialog = new AlertDialog.Builder(LogInActivity.this);
                dialog.setTitle("this is an alert");
                dialog.setMessage("your password is invalid");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(LogInActivity.this, "try again", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(LogInActivity.this, "last chance",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();

            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 3) {
                    finish();
                }
            }
        });

    }

}
