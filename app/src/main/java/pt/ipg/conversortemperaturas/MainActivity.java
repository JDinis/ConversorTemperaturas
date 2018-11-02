package pt.ipg.conversortemperaturas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostraTemperaturas();
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

    public void mostraTemperaturas() {
        Intent intent = new Intent(this, MostraTemperaturasActivity.class);
        EditText editTextTemperatura = (EditText) findViewById(R.id.editTextTemperatura);
        RadioButton radioButtonFarhenheit = (RadioButton)findViewById(R.id.radioButtonFarhenheit);

        if(editTextTemperatura.getText().toString().isEmpty()){
            editTextTemperatura.setError(getString(R.string.Insira_Temperatura));
            editTextTemperatura.requestFocus();
            return;
        }

        double valorTemperatura = 0;
        try {
            valorTemperatura = Double.parseDouble(editTextTemperatura.getText().toString());
        } catch (NumberFormatException e) {
            editTextTemperatura.setError(getString(R.string.Erro_Temperatura));
            editTextTemperatura.requestFocus();
            return;
        }

        if(radioButtonFarhenheit.isChecked()){
            AppData.temperatura = new TemperaturaFahrenheit(valorTemperatura);
        }else{
            AppData.temperatura = new TemperaturaCelsius(valorTemperatura);
        }

        startActivity(intent);
    }
}
