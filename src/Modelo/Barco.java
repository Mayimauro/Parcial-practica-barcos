package Modelo;

import Interfaz.IPrecio;

public abstract class Barco implements IPrecio {
    private String modelo;
    private String marca;
    private int capacidadCombustible; // en kg
    private int capacidadCarga; //en kg
    private int patente;

 ///constructor
    public Barco(String modelo, String marca, int capacidadCombustible, int capacidadCarga, int patente) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
    }

    ///getter y setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    //metodos




    @Override
    public String toString() {
        return "Barco{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente=" + patente +
                '}';
    }

    @Override
    public int calcularPrecioFinal() {
        return 0;
    }
}
