package com.grahsewa.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.grahsewa.R;

public class AdminPanel extends AppCompatActivity {

    ImageView siv,miv,eiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_panel_activity);

        siv = (ImageView)findViewById(R.id.siv);
        miv = (ImageView)findViewById(R.id.miv);
        eiv = (ImageView)findViewById(R.id.eiv);

        siv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminPanel.this,SuserPanel.class);
                startActivity(intent);
            }
        });

        miv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminPanel.this,MuserPanel.class);
                startActivity(intent);
            }
        });

        eiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AdminPanel.this,EuserPanel.class);
                startActivity(intent);
            }
        });

    }
}
