package pt.ipg.conversortemperaturas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MostraTemperaturasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_temperaturas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textViewResultadoCelsius = (TextView)findViewById(R.id.textViewResultadoCelsius);
        TextView textViewResultadoFahrenheit = (TextView)findViewById(R.id.textViewResultadoFahrenheit);

        // .00 mostra sempre as duas casas decimais
        // .## mostra apenas as casas decimais diferentes de 0
        // obrigar duas casas unidatarias: 00.00, 0#.00 não funciona possivelmente #0.00
        DecimalFormat df = new DecimalFormat("00.00");

        textViewResultadoCelsius.setText(df.format(AppData.temperatura.getCelsius()));
        //textViewResultadoFahrenheit.setText(df.format(AppData.temperatura.getFahrenheit()));
        textViewResultadoFahrenheit.setText(String.format("%.2f",AppData.temperatura.getFahrenheit()));
    }

}
