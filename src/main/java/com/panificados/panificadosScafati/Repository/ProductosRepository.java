package com.panificados.panificadosScafati.Repository;

import com.panificados.panificadosScafati.Entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
    public Productos findByNombreProducto(String nombreProducto);
    public Boolean existsByNombreProducto(String nombreProducto);

}
