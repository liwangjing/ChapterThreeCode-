package com.example.jing.chapterthree;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressActivity extends Activity {

    private Button progressControlButton;
    private ProgressBar progressBar;
    private int count=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progresslayout);

        progressControlButton = (Button)findViewById(R.id.progressControlButton);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        progressControlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(progressBar.getVisibility()==View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                }
                if (count%2==0) {
                    ProgressDialog progressDialog = new ProgressDialog(ProgressActivity.this);
                    progressDialog.setTitle("Progress Dialog");
                    progressDialog.setMessage("Loading......");
                    progressDialog.setCancelable(true);
                    progressDialog.show();
                }
            }
        });

    }
}
