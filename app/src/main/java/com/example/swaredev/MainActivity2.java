package com.example.swaredev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int Counter = 0;

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPopUp();
            }
        });



    }

    private void showPopUp() {
        addCounter();
        Snackbar snackbar=(Snackbar) Snackbar.make(findViewById(R.id.coordinator),"You clicked this button " + counter + " time(s) and was lastly clicked on " + currentDate(),2500);
        snackbar.show();
    }
    private void addCounter(){
        counter ++;
    }
    private Date currentDate() {
        Date date=java.util.Calendar.getInstance().getTime();
        return date;
    }

}