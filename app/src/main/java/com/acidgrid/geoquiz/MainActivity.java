package com.acidgrid.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioButton sahara ;
    public RadioButton Russia ;
    public EditText nile  ;
    public RadioButton vatican ;
    public CheckBox mexico ;
    public CheckBox USA  ;
    public CheckBox Canada ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public int CheckAnswer(int num)
    {

        sahara = (RadioButton) findViewById(R.id.SaharaDesert);
        Russia = (RadioButton) findViewById(R.id.Russia);
        nile = (EditText) findViewById(R.id.EditQuestion3);
        vatican = (RadioButton) findViewById(R.id.Vatican);
        mexico = (CheckBox) findViewById(R.id.Mexico);
        USA = (CheckBox) findViewById(R.id.USAQuestion5);
        Canada = (CheckBox) findViewById(R.id.canadaQuestion3);
        switch (num)
        {
            case 0:
                if(sahara.isChecked()) {
                    return 1;
                } else {
                    return 0;
                }
            case 1:
                if(Russia.isChecked()){
                    return 1;
                }else{
                    return 0;
                }
            case 2:
                if(nile.getText().toString().toLowerCase().equals("nile"))
                {
                    return 1;
                }else{
                    return 0;
                }
            case 3:
                if(vatican.isChecked()){
                    return 1;
                }else {
                    return 0;
                }
            case 4:
                if (mexico.isChecked() && USA.isChecked() && Canada.isChecked())
                {
                    return 1;
                }
                else {
                    return 0;
                }
        }
        return 0;
    }


    public void submitButtonPressed(View view){
        int tempScore = 0;
        for(int i = 0; i<5; i++)
        {
            tempScore += CheckAnswer(i);
        }
        Toast.makeText(this, "Your score is " + tempScore + " out of 5", Toast.LENGTH_SHORT).show();
    }


}
