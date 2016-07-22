package com.example.guntasgrewal.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void respond(String data) {
        FragmentManager fm = getSupportFragmentManager();
        DemoFragment2 df2 = (DemoFragment2) fm.findFragmentById(R.id.fragment2);
        df2.changeText(data);
    }
}
