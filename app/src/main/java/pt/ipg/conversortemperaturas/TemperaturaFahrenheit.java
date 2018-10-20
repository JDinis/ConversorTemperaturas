package pt.ipg.conversortemperaturas;

public class TemperaturaFahrenheit extends Temperatura {
    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return graus em Fahrenheit
     */
    @Override
    public double getFahrenheit() {
        return valor;
    }

    /**
     * Devolve a temperatura em graus Celsius
     * @return graus em Celsius
     */
    @Override
    public double getCelsius() {
        return (valor - 32.0) / (9.0 / 5.0);
    }
}
