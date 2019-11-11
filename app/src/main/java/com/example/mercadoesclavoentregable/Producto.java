package com.example.mercadoesclavoentregable;

import java.io.Serializable;

public class Producto implements Serializable {

    private Integer imagen;
    private String nombre;
    private String precio;

    public Producto(String precio, Integer imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}