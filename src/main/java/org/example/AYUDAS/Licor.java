package org.example.AYUDAS;

import java.time.LocalDate;

public class Licor {

    private String nombre;
    private String marca;
    private String tipo;
    private Double Precio;
    private LocalDate fechaCaducidad;

    public Licor() {
    }

    public Licor(String nombre, String marca, String tipo, Double precio, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        Precio = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
