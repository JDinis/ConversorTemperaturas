package pt.ipg.conversortemperaturas;

public class TemperaturaCelsius extends Temperatura {
    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return graus em Fahrenheit
     */
    @Override
    public double getFahrenheit() {
        //.0 para converter automaticamente para double (ou float)
        return valor * 9.0/5.0 + 32.0;
    }

    /**
     * Devolve a temperatura em graus Celsius
     * @return graus em Celsius
     */
    @Override
    public double getCelsius() {
        return valor;
    }
}
