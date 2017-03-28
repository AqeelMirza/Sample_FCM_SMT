package com.example.itp.sample_fcm.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.itp.sample_fcm.R;

/**
 * Created by ITP on 3/21/2017.
 */

public class First_Screen_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_screen);

        Button parent_btn = (Button) findViewById(R.id.parent_btn);
        Button child_btn = (Button) findViewById(R.id.child_btn);

        parent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(First_Screen_Activity.this, Login.class);
                startActivity(i);
            }
        });
        child_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First_Screen_Activity.this, Get_Child_Activity.class);
                startActivity(i);
            }
        });

    }
}
