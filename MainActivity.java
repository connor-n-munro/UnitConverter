package com.example.unitconverter;

import android.os.Bundle;
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
        //personal code
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setCancelable(true);
        alertDialogBuilder.setTitle("Conversion done!");
        final Button milesButton = findViewById(R.id.milesButton);
        final Button metersButton = findViewById(R.id.metersButton);
        final Button kilButton = findViewById(R.id.kilometersButton);
        final Button empireButton = findViewById(R.id.empireButton);
        final ImageView ruffalo = findViewById(R.id.ruffaloButton);
        milesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 63360.0;
                EditText feet = findViewById(R.id.ft);
                EditText inches = findViewById(R.id.in);
                String ftString = feet.getText().toString();
                String inString = inches.getText().toString();
                int ft = 0;
                int in = 0;
                if(!ftString.isEmpty())
                {
                    ft = Integer.parseInt(ftString);
                }
                if(!inString.isEmpty())
                {
                    in = Integer.parseInt(inString);
                }
                double total = in + (ft * 12);
                double totalMiles = total/divisor;
                alertDialogBuilder.setMessage(ft + "'" + in + "\" is " + totalMiles + " miles!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        metersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 39.3701;
                EditText feet = findViewById(R.id.ft);
                EditText inches = findViewById(R.id.in);
                String ftString = feet.getText().toString();
                String inString = inches.getText().toString();
                int ft = 0;
                int in = 0;
                if(!ftString.isEmpty())
                {
                    ft = Integer.parseInt(ftString);
                }
                if(!inString.isEmpty())
                {
                    in = Integer.parseInt(inString);
                }
                int total = in + (ft * 12);
                double totalMeters = total/divisor;
                alertDialogBuilder.setMessage(ft + "'" + in + "\" is " + totalMeters + " meters!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        kilButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 39370.1;
                EditText feet = findViewById(R.id.ft);
                EditText inches = findViewById(R.id.in);
                String ftString = feet.getText().toString();
                String inString = inches.getText().toString();
                int ft = Integer.parseInt(ftString);
                int in = Integer.parseInt(inString);
                int total = in + (ft * 12);
                double totalKilometers = total/divisor;
                alertDialogBuilder.setMessage(ft + "'" + in + "\" is " + totalKilometers + " kilometers!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        empireButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                int divisor = 17448;
                EditText feet = findViewById(R.id.ft);
                EditText inches = findViewById(R.id.in);
                String ftString = feet.getText().toString();
                String inString = inches.getText().toString();
                int ft = 0;
                int in = 0;
                if(!ftString.isEmpty())
                {
                    ft = Integer.parseInt(ftString);
                }
                if(!inString.isEmpty())
                {
                    in = Integer.parseInt(inString);
                }
                int total = in + (ft * 12);
                double totalEmpires = total/divisor;
                alertDialogBuilder.setMessage(ft + "'" + in + "\" is " + totalEmpires + " Empire State Buildings!");
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }
        });
        ruffalo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                double divisor = 68.0;
                EditText feet = findViewById(R.id.ft);
                EditText inches = findViewById(R.id.in);
                String ftString = feet.getText().toString();
                String inString = inches.getText().toString();
                int ft = 0;
                int in = 0;
                if(!ftString.isEmpty())
                {
                    ft = Integer.parseInt(ftString);
                }
                if(!inString.isEmpty())
                {
                    in = Integer.parseInt(inString);
                }
                double total = in + (ft * 12);
                double totalRuffalos = total/divisor;
                alertDialogBuilder.setMessage(ft + "'" + in + "\" is " + totalRuffalos + " Mark Ruffalo's!");
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
