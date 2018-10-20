package pt.ipg.conversortemperaturas;

public abstract class Temperatura {
    protected double valor;

    //todo: Implementar graus Kelvin

    /**
     * Devolve a temperatura em graus Fahrenheit
     * @return graus em Fahrenheit
     */
    public abstract double getFahrenheit();
    /**
     * Devolve a temperatura em graus Celsius
     * @return graus em Celsius
     */
    public abstract double getCelsius();
}
