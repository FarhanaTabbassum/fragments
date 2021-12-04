package com.example.fragments_main;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    Button btnRed,btnYellow;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnRed=findViewById(R.id.red);
        btnYellow=findViewById(R.id.yellow);
        layout=findViewById(R.id.linear);
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                FirstFragment firstFragment=new FirstFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,firstFragment);
                transaction.commit();
            }
        });
        btnYellow.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment=new SecondFragment();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear,secondFragment);
                transaction.commit();
            }
        });
    }
}