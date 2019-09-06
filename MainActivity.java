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
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setCancelable(true);
        alertDialogBuilder.setTitle("Conversion done!");
        EditText feet = (EditText) findViewById(R.id.ft);
        EditText inches = (EditText) findViewById(R.id.in);
        String ftString = feet.getText().toString();
        String inString = inches.getText().toString();
        int ft = Integer.parseInt(ftString);
        int in = Integer.parseInt(inString);
        final int total = in + (ft * 12);
        final Button milesButton = findViewById(R.id.milesButton);
        final Button metersButton = findViewById(R.id.metersButton);
        final Button kilButton = findViewById(R.id.kilometersButton);
        final Button empireButton = findViewById(R.id.empireButton);
        final ImageView ruffalo = findViewById(R.id.ruffaloButton);
        milesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double totalMiles = total/63360;
                alertDialogBuilder.setMessage(totalMiles + "!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        metersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 39.3701;
                double totalMeters = total/divisor;
                alertDialogBuilder.setMessage(totalMeters + "!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        kilButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 39370.1;
                double totalKilometers = total/divisor;
                alertDialogBuilder.setMessage(totalKilometers + "!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        empireButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                int divisor = 17448;
                double totalEmpires = total/divisor;
                alertDialogBuilder.setMessage(totalEmpires + "!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        ruffalo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                int divisor = 68;
                double totalRuffalos = total/divisor;
                alertDialogBuilder.setMessage(totalRuffalos + "!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });

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
}
