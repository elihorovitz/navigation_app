package com.example.navigation_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.regex.Pattern;

public class Main3Activity extends AppCompatActivity {

    private static final Pattern sPattern
            = Pattern.compile("^[0-9]{5}$");

    EditText txt;

    private boolean isValid(CharSequence s) {
        return sPattern.matcher(s).matches();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = (EditText) findViewById(R.id.digitEditor);
        txt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (isValid(txt.getText()))
                {
                  end();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }


        });
    }

    public void end()
    {
        Intent first = new Intent(this, MainActivity.class);
        first.putExtra(getString(R.string.digits), txt.getText().toString());
        startActivity(first);
        finish();
    }



}
