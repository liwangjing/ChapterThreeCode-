package com.example.jing.chapterthree;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button logInButton;
    private TextView titleText;
    private Button progressBarButton;
    private Button listViewButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = (TextView)findViewById(R.id.titleText);

        logInButton = (Button)findViewById(R.id.logInButton);
        logInButton.setOnClickListener(new ButtonListener());

        progressBarButton = (Button)findViewById(R.id.progressButton);
        progressBarButton.setOnClickListener(new ButtonListener());

        listViewButton = (Button)findViewById(R.id.listViewButton);
        listViewButton.setOnClickListener(new ButtonListener());

    }
    
    class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Button b= (Button)v;
            int id = b.getId();
            String title = b.getText().toString();
            titleText.setText("YOU JUST OPENED :" + title);
            Intent intent;
            switch(id) {
                case R.id.logInButton :
                    intent = new Intent(MainActivity.this, LogInActivity.class);
                    startActivity(intent);
                    break;
                case R.id.progressButton :
                    intent = new Intent(MainActivity.this, ProgressActivity.class);
                    startActivity(intent);
                    startActivity(intent);
                    break;
                case R.id.listViewButton :
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    startActivity(intent);
                    startActivity(intent);
                    break;
            }
        }
    }


}
