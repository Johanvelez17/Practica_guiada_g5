package org.example.MODELOS;

public class Cliente {

    private String nombre;
    private String telefono;
    private String documentoIdentificacion;
    private String correo;
    private Integer edad;

    public Cliente() {
    }

    public Cliente(String nombre, String telefono, String documentoIdentificacion, String correo, Integer edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.documentoIdentificacion = documentoIdentificacion;
        this.correo = correo;
        this.edad = edad;
    }
}
