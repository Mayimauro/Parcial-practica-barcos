package Modelo;

import Interfaz.IPrecio;

public class Corbeta extends Barco implements IPrecio{
    private int cantidadJaulas;

    ///constructor
    public Corbeta(String modelo, String marca, int capacidadCombustible, int capacidadCarga, int patente, int cantidadJaulas) {
        super(modelo, marca, capacidadCombustible, capacidadCarga, patente);
        this.cantidadJaulas = cantidadJaulas;
    }
    ///getter y setter

    public int getCantidadJaulas() {
        return cantidadJaulas;
    }
//metodos
    @Override
    public int calcularPrecioFinal() {
        return getCapacidadCarga()*11;
    }

    @Override
    public String toString() {
        return "Corbeta{" +
                "cantidadJaulas=" + cantidadJaulas +
                '}';
    }
}
