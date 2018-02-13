package com.example.android.literallyhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String toast = ("\ud83c\udf0e") + " " + getApplicationContext().getString(R.string.toast) + " " + ("\ud83d\ude01");
                Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
