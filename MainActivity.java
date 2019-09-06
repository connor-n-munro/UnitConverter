package com.example.unitconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setCancelable(true);
        EditText feet = (EditText) findViewById(R.id.ft);
        EditText inches = (EditText) findViewById(R.id.in);
        String ftString = feet.getText().toString();
        String inString = inches.getText().toString();
        int ft;
        int in;
        try
        {
        for (int i = 0; i < ftString.length() - 1; i++) {
            if (ftString.charAt(i) < 48 || ftString.charAt(i) > 57) {
                throw new IllegalArgumentException("Please use only numbers!");
            }
        }
        for (int j = 0; j < inString.length(); j++) {
            if (inString.charAt(j) < 48 || inString.charAt(j) > 57) {
                throw new IllegalArgumentException("Please use only numbers!");
            }
        }
         }
        catch (IllegalArgumentException e)
        {
            alertDialogBuilder.setTitle("Error!");
            alertDialogBuilder.setMessage(e.getMessage());
            AlertDialog alert = alertDialogBuilder.create();
            alert.show();
        }
        ft = Integer.parseInt(ftString);
        in = Integer.parseInt(inString);
        final int total = in + (ft * 12);
        final Button milesButton = findViewById(R.id.milesButton);
        milesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                float totalMiles = total/63360;
                alertDialogBuilder.setTitle("Conversion done!");
                alertDialogBuilder.setMessage()
            }
        })

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public
}
