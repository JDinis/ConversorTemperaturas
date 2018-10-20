package pt.ipg.conversortemperaturas;

public class TemperaturaFahrenheit extends Temperatura {

    public TemperaturaFahrenheit(double valor){
        this.valor = valor;
    }

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
        //Convem colocar .0 para converter automaticamente para double (ou float)
        return (valor - 32.0) / (9.0 / 5.0);
    }
}
