package com.example.csy.androidandreactapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_activity_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReactOneActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv_activity_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReactTwoActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv_fragment_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReactUseInFragmentActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv_fragment_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReactUseInFragmentTwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
