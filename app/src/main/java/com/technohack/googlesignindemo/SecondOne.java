package com.technohack.googlesignindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecondOne extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_one);

        mAuth=FirebaseAuth.getInstance();

        logoutBtn=findViewById(R.id.signOut_btnId);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logout();

            }
        });
    }

    private void logout() {

        mAuth.signOut();
        startActivity(new Intent(SecondOne.this,MainActivity.class));
        finish();

    }
}
