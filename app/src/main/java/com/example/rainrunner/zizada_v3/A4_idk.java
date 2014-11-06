package com.example.rainrunner.zizada_v3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.rainrunner.zizada_v3.R;

public class A4_idk extends Activity {

    Button addieren, subtrahieren, multiplizieren, dividieren, back;
    EditText Zahl1, Zahl2;
    TextView Ausgabe;
    String str;
    int num_1, num_2, summe_1,counter;
    float num_11, num_22, summe_11;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4_idk);

        addieren = (Button) findViewById(R.id.a4_button_addieren);
        subtrahieren = (Button) findViewById(R.id.a4_button_subtrahieren);
        multiplizieren = (Button) findViewById(R.id.a4_button_mulziplizieren);
        dividieren = (Button) findViewById(R.id.a4_button_dividieren);
        back = (Button) findViewById(R.id.a4_button_zurueck);

        Ausgabe = (TextView) findViewById(R.id.textView_Ausgabe);

        Zahl1 = (EditText) findViewById(R.id.editText_zahl1);
        Zahl2 = (EditText) findViewById(R.id.editText_Zahl2);




        addieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_1 = Integer.valueOf(Zahl1.getText().toString());
                num_2 = Integer.valueOf(Zahl2.getText().toString());

                summe_1 =num_1+num_2;
                str = Integer.toString(summe_1);
                Ausgabe.setText(str);
                counter+=1;

            }
        });

        subtrahieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_1 = Integer.valueOf(Zahl1.getText().toString());
                num_2 = Integer.valueOf(Zahl2.getText().toString());

                summe_1=num_1-num_2;


                str = Integer.toString(summe_1);


                Ausgabe.setText(str);


                counter+=1;

            }
        });

        dividieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_11 = Float.valueOf(Zahl1.getText().toString());
                num_22 = Float.valueOf(Zahl2.getText().toString());

                summe_11 = num_11 / num_22;

                str = Float.toString(summe_11);
                Ausgabe.setText(str);
                counter+=1;


            }
        });

        multiplizieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num_11 = Float.valueOf(Zahl1.getText().toString());
                num_22 = Float.valueOf(Zahl2.getText().toString());

                summe_11 = num_11 * num_22;

                str = Float.toString(summe_11);
                Ausgabe.setText(str);
                counter+=1;

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.a4_idk, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
