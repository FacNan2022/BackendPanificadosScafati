package com.panificados.panificadosScafati.Interfaces;

import com.panificados.panificadosScafati.Entity.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductosInterfaces {

    public List<Productos> listaProductos();
    public Optional<Productos> buscaProductoPorId(int id);
    public void guardarProducto(Productos producto);
    public void eliminarProducto(int id);
    public Boolean existeProducto(int id);
    public Boolean existeNombre(String nombre);

}
