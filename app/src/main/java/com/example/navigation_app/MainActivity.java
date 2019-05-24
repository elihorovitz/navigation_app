package com.example.navigation_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    private final int GO_THIRD = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String currText;
        if (getIntent().getStringExtra(getString(R.string.digits)) != null)
        {
            currText = getIntent().getStringExtra(getString(R.string.digits));
            TextView textView = findViewById(R.id.forDigits);
            textView.setText(String.format("you have entered: %s", currText));
        }
    }

    public void goSecond(View view) {
        Intent second = new Intent(this, Main2Activity.class);
        startActivity(second);
        finish();
    }

    public void goThird(View view) {
        Intent third = new Intent(this, Main3Activity.class);
        startActivity(third);
        finish();

    }


}

