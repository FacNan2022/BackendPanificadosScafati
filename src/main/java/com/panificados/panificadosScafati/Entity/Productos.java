package com.panificados.panificadosScafati.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Productos {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
   private String nombreProducto;
    @NotNull
    private String descripcionProducto;
    @NotNull
    private int precioProducto;
    @NotNull
    private String imagenProducto;
}
