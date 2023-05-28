package Modelo;

import Interfaz.IPrecio;

public class LanchaAmarilla extends Barco implements IPrecio{
    private int capacidadRecoleccion;
    private int horas;

    ///constructor
    public LanchaAmarilla(String modelo, String marca, int capacidadCombustible, int capacidadCarga, int patente, int capacidadRecoleccion, int horas) {
        super(modelo, marca, capacidadCombustible, capacidadCarga, patente);
        this.capacidadRecoleccion = capacidadRecoleccion;
        this.horas = horas;
    }
    ///getter y setter

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }
    ///metodos

    @Override
    public int calcularPrecioFinal() {
        return (capacidadRecoleccion*horas)*11;
    }

    @Override
    public String toString() {
        return "LanchaAmarilla{" +
                "capacidadRecoleccion=" + capacidadRecoleccion +
                ", horas=" + horas +
                '}';
    }
}
