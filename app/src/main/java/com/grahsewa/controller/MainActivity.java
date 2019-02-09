package com.grahsewa.controller;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.grahsewa.R;
import com.grahsewa.model.Suser;

public class MainActivity extends AppCompatActivity {

    TextView sHeading;
    EditText sMobile,sPassword;
    Button sSignin,sSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        sHeading = (TextView)findViewById(R.id.s_heading);
        sMobile = (EditText)findViewById(R.id.s_mobile);
        sPassword = (EditText)findViewById(R.id.s_password);
        sSignin = (Button)findViewById(R.id.s_signin);
        sSignup = (Button)findViewById(R.id.s_signup);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_suser = database.getReference("users");

        final ProgressDialog myProgressBar = new ProgressDialog(MainActivity.this);
        myProgressBar.setMessage("Please wait..");


        sSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myProgressBar.show();
                table_suser.addValueEventListener(new ValueEventListener() {

                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        Suser suser = dataSnapshot.child("susers").child(sMobile.getText().toString()).getValue(Suser.class);

                        if(dataSnapshot.child("susers").child(sMobile.getText().toString()).exists())
                        {
                            myProgressBar.dismiss();
                            if(suser.getPassword().equals(sPassword.getText().toString()))
                            {
                                Log.d("MainActivityLog","Login Successful");
                                Intent intent = new Intent(MainActivity.this,AdminPanel.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Log.d("MainActivityLog","Login Failed Wrong Password");
                                Toast.makeText(MainActivity.this,"Wrong Password",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            myProgressBar.dismiss();
                            Log.d("MainActivityLog","User Not Exists");
                            Toast.makeText(MainActivity.this,"user not exists",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}
