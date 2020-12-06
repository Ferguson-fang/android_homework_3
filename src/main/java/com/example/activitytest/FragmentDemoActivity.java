package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentDemoActivity extends AppCompatActivity {
    myFragmentActivity myFragment = new myFragmentActivity();
    My2FragmentActivity my2Fragment = new My2FragmentActivity();
    Button btnFragment1;
    Button btnFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo);

        btnFragment1 = findViewById(R.id.btn_fragment1);
        btnFragment2 = findViewById(R.id.btn_fragment2);

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fl_fragment,my2Fragment);
                transaction.commit();
            }
        });

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fl_fragment,myFragment);
                transaction.commit();
            }
        });
        btnFragment1.callOnClick();
    }
}