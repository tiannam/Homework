package com.example.tiannanmcclanahan.homework;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gradeButton = (Button) findViewById(R.id.button_5);
        Button passorfailButton = (Button) findViewById(R.id.button4);
        Button fivetimesButton = (Button) findViewById(R.id.button3);

        gradeButton.setOnClickListener(new View.OnClickListener() {
            TextView gradeOutput = (TextView) findViewById(R.id.output);
            TextView gradeInput = (TextView) findViewById(R.id.input);


            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                String grade = gradeInput.getText().toString();
                int score = new Integer(grade).intValue();
                if (score <= 60 && score >= 0) {
                    gradeOutput.setText("F");
                    gradeOutput.setTextColor(Color.RED);
                } else if (score <= 69 && score >= 60) {
                    gradeOutput.setText("D");
                    if (score <= 64) {
                        gradeOutput.setTextColor(Color.RED);
                    } else {
                        gradeOutput.setTextColor(Color.GREEN);
                    }
                } else if (score <= 79 && score >= 70) {
                    gradeOutput.setText("C");
                    gradeOutput.setTextColor(Color.GREEN);
                } else if (score <= 89 && score >= 80) {
                    gradeOutput.setText("B");
                    gradeOutput.setTextColor(Color.GREEN);
                } else if (score <= 100 && score >= 90) {
                    gradeOutput.setText("A");
                    gradeOutput.setTextColor(Color.GREEN);
                } else {

                    Toast.makeText(MainActivity.this, "This is not a valid score.", Toast.LENGTH_LONG).show();
                }
            }
        });
        passorfailButton.setOnClickListener(new View.OnClickListener() {
            TextView gradeOutput = (TextView) findViewById(R.id.output);
            TextView gradeInput = (TextView) findViewById(R.id.input);

            public void onClick(View view) {
                String grade = gradeInput.getText().toString();
                int score = new Integer(grade).intValue();
                if (score > 64) {
                    gradeOutput.setText("Pass");
                    gradeOutput.setTextColor(Color.GREEN);
                } else {
                    gradeOutput.setText("Fail");
                    gradeOutput.setTextColor(Color.RED);
                }
            }

        });
        fivetimesButton.setOnClickListener(new View.OnClickListener() {
            TextView gradeOutput = (TextView) findViewById(R.id.output);
            TextView gradeInput = (TextView) findViewById(R.id.input);


            public void onClick(View view) {
                String grade = gradeInput.getText().toString();
                int score = new Integer(grade).intValue();
                int iterations = 5;
                for (int i = 0; i < iterations; i++) {
                    gradeOutput.setText(grade);

                }
            }
        });
    }
}

