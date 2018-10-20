package pt.ipg.conversortemperaturas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TemperaturasUnitTest {

    private static final double TOLERANCIA_DECIMAIS = 0.001;

    @Test
    public void conversaoTemperaturasEstaCorrecta() {
        Temperatura x = new TemperaturaCelsius(13);
        assertEquals(13,x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(55.4,x.getFahrenheit(), TOLERANCIA_DECIMAIS);

        x = new TemperaturaFahrenheit(39.2);
        assertEquals(4,x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(39.2,x.getFahrenheit(), TOLERANCIA_DECIMAIS);

        x = new TemperaturaCelsius(23.0);
        assertEquals(23.0,x.getCelsius(), TOLERANCIA_DECIMAIS);
        assertEquals(73.4,x.getFahrenheit(), TOLERANCIA_DECIMAIS);
    }
}