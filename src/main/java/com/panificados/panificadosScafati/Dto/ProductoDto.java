package com.panificados.panificadosScafati.Dto;

import javax.validation.constraints.NotBlank;

public class ProductoDto {
    @NotBlank
    private String nombre_producto;
    @NotBlank
    private String descripcion_producto;
    @NotBlank
    private String imagen_producto;

    //Constructor vacio


    public ProductoDto() {
    }

    //Constructor con parametros

    public ProductoDto(String nombre_producto, String descripcion_producto, String imagen_producto) {
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.imagen_producto = imagen_producto;
    }

    //Getters y Setters

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(String imagen_producto) {
        this.imagen_producto = imagen_producto;
    }
}
