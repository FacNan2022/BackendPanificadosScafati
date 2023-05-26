package com.panificados.panificadosScafati.Service;


import com.panificados.panificadosScafati.Entity.Productos;
import com.panificados.panificadosScafati.Interfaces.ProductosInterfaces;
import com.panificados.panificadosScafati.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductoService implements ProductosInterfaces {


    @Autowired
    ProductosRepository productosRepository;
    @Override
    public List<Productos> listaProductos() {
        return productosRepository.findAll();
    }

    @Override
    public Optional<Productos> buscaProductoPorId(int id) {
        return productosRepository.findById(id);
    }

    @Override
    public void guardarProducto(Productos producto) {
        productosRepository.save(producto);

    }

    @Override
    public void eliminarProducto(int id) {
        productosRepository.deleteById(id);

    }

    @Override
    public Boolean existeProducto(int id) {
        return productosRepository.existsById(id);
    }

    @Override
    public Boolean existeNombre(String nombre) {
        return productosRepository.existsByNombreProducto(nombre);
    }
}
