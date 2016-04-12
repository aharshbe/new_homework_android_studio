package com.example.ahars.first_deliverable;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);

        button.setOnClickListener (new View.OnClickListener() {

            TextView textView = (TextView) findViewById(R.id.textView);
            EditText editText = (EditText) findViewById(R.id.editText);
            String grade = editText.getText().toString();
            int score = new Integer(grade).intValue();


            public void onClick(View view) {
                System.out.println("Please choose a grade point range from 100 to 0");


                if (score >= 90 && score <= 100) {
                    System.out.println('A');
                } else if (score >= 80 && score <= 90) {
                    System.out.println('B');
                } else if (score >= 70 && score <= 80) {
                    System.out.println('C');
                } else if (score >= 60 && score <= 70) {
                    System.out.println('D');
                } else if (score >= 0 && score <= 60) {
                    System.out.println('F');
                } else {
                    System.out.println("You either chose a number above 100 at which point you have an A+ or you chose a negative number at which point you're being cheeky ;)");

                }

                textView.setTextColor(Color.MAGENTA);
                Toast.makeText(MainActivity.this, "You clicked Grade!", Toast.LENGTH_SHORT).show();


            }

        });


        button2.setOnClickListener (new View.OnClickListener() {

            TextView textView = (TextView) findViewById(R.id.textView);
            EditText editText = (EditText) findViewById(R.id.editText);
            String passFail = editText.getText().toString();
            int theirPoints = new Integer(passFail).intValue();


            public void onClick(View view) {

                if (theirPoints >= 65){
                    System.out.println("Pass");
                }else if (theirPoints <= 65){
                    System.out.println("Fail");
                }else{
                    System.out.println("Those points are negative at which point you're being cheeky!");
                }

                textView.setTextColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "You clicked Pass or Fail!", Toast.LENGTH_SHORT).show();


            }



        });

        button3.setOnClickListener (new View.OnClickListener() {

            TextView textView = (TextView) findViewById(R.id.textView);
            EditText editText = (EditText) findViewById(R.id.editText);
            String grade = editText.getText().toString();
            int theirNumber = new Integer(grade).intValue();

            public void onClick(View v) {
                System.out.println("Pick a number");
                int iterations = 5;
                for (int i = 0; i < iterations; i++) {
                    System.out.print(theirNumber);

                }

                textView.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "You clicked 5 times!", Toast.LENGTH_SHORT).show();


            }


        });


    }

}

























