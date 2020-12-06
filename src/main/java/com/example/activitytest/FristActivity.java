package com.example.activitytest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import recyclerview.RecyclerViewActivity;
import vp_fm_tl.Vp_Fm_TlActivity;


public class FristActivity extends AppCompatActivity {
    private Button button_1;
    private Button recyclerView;
    private Button ViewPager;
    private Button fragment;
    private View Vp_fragment;
    private Button level_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frist_layout);

        button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked Button1",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });

        recyclerView = findViewById(R.id.rv_demo);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked recyclerView",
                        Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(FristActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        ViewPager = findViewById(R.id.ViewPager);
        ViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked ViewPager",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this,ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        fragment = findViewById(R.id.fragment);
        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked fragment",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this,FragmentDemoActivity.class);
                startActivity(intent);
            }
        });
        Vp_fragment = findViewById(R.id.vp_fragment);
        Vp_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked vp_fragment",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this, TabLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        level_2 = findViewById(R.id.level_2);
        level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FristActivity.this,"You clicked level_2",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FristActivity.this, Vp_Fm_TlActivity.class);
                startActivity(intent);
            }
        });

    }
}