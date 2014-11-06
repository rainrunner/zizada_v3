package com.example.rainrunner.zizada_v3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;


public class Home_activity extends Activity {

    String str = "HALLO";
    Button Button_for_next_activity;
    TextView textView, textView_1,textView3;
    RadioButton Radio1;
    Switch switch_1;
    ImageButton ibutton;
    EditText Etext;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

        Etext =(EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView3);
        Button_for_next_activity = (Button) findViewById(R.id.button);
        textView3= (TextView) findViewById(R.id.textView);
        textView_1= (TextView) findViewById(R.id.textView2);
        Radio1 = (RadioButton) findViewById(R.id.radioButton);
        switch_1 = (Switch) findViewById(R.id.switch1);
        ibutton = (ImageButton) findViewById(R.id.imageButton);
        switch_1.setChecked(true);


        /* if(switch1.isChecked()){
            textView.setText("YOLOLOLOLOOLOLOLOLO");
        }else {
            textView_1.setText("NOPE");
        }*/
        textView.setText("NOPE");

        ibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter-=1;
                textView.setText("counter =" + counter);
            }
        });


        Button_for_next_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent nextScreen = new Intent(getApplicationContext(),activity_2.class);
                //startActivity(nextScreen);
                str = (String) Etext.getText().toString();
                counter=str.length();
                textView_1.setText(str);
                textView3.setText("Length = " + counter);


            }
        });

        switch_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    textView.setText("Switch ON");
                    str=str.substring(3);
                    if(str.length() >= 0){
                        textView.setText(str);
                    }


                } else {
                    textView.setText("Switch OFF");
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_activity, menu);
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
