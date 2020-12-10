package edu.ib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //  zaprogramowanie urzycia elementów aplikacji
    public void onClickBtn(View view) {
        EditText tempIn = (EditText) findViewById(R.id.tempInput);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String scalaIn = spinner.getSelectedItem().toString();
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        String scalaOut = spinner1.getSelectedItem().toString();
        TextView wynik = (TextView) findViewById(R.id.wynik);

        double tempInput = Double.valueOf(tempIn.getText().toString());
        double tempOut = 0;
        TemperatureConverter tc = new TemperatureConverter();

        // Warunki służace do wyboru metody przeliczania temperatury
        if (scalaIn.equals("Celcjusz") && scalaOut.equals("Kelvin"))
            tempOut = tc.celcjuszToKelvin(tempInput);
        if (scalaIn.equals("Kelvin") && scalaOut.equals("Celcjusz"))
            tempOut = tc.kelvinToCelcjusz(tempInput);
        if (scalaIn.equals("Celcjusz") && scalaOut.equals("Farenheit"))
            tempOut = tc.celcjuszToFaren(tempInput);
        if (scalaIn.equals("Kelvin") && scalaOut.equals("Farenheit"))
            tempOut = tc.kelvinToFaren(tempInput);
        if (scalaIn.equals("Farenheit") && scalaOut.equals("Celcjusz"))
            tempOut = tc.farenToCelcjusz(tempInput);
        if (scalaIn.equals("Farenheit") && scalaOut.equals("Kelvin"))
            tempOut = tc.farenToKelv(tempInput);
        if (Double.isInfinite(tempInput) || Double.isNaN(tempInput))
            wynik.setText("Wprowadź temperature!");

        DecimalFormat format = new DecimalFormat("#.##");
        wynik.setText(String.valueOf(format.format(tempOut)));
    }
}