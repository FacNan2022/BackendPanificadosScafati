/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.panificados.panificadosScafati.Controller;

import com.panificados.panificadosScafati.Dto.ProductoDto;
import com.panificados.panificadosScafati.Entity.Productos;
import com.panificados.panificadosScafati.Mensaje.Mensaje;
import com.panificados.panificadosScafati.Service.ProductoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("panificados/")
@CrossOrigin(origins = {"https://panificadosscafati.web.app","http://localhost:4200"})
public class productosController {
    
    @Autowired
    ProductoService productoService;
    
    @GetMapping("productos")
    public ResponseEntity<List<Productos>>getAll(){
        List<Productos> productos = productoService.listaProductos();
        
        return new ResponseEntity(productos, HttpStatus.OK);
        
    }
    
    
    @GetMapping("detalles/{id}")
     public ResponseEntity<Productos> getOne(@PathVariable("id")int id){
       Productos producto = productoService.buscaProductoPorId(id).get();
         return new ResponseEntity<> (producto, HttpStatus.OK);
         
     }
     
     
     @PostMapping("create")  
     public ResponseEntity<?>createProducto(@RequestBody ProductoDto productoDto){
         Productos producto = new Productos(productoDto.getNombre_producto(), productoDto.getImagen_producto(), productoDto.getDescripcion_producto(), productoDto.getPrecioProducto());
         productoService.guardarProducto(producto);
                 return new ResponseEntity<>(new Mensaje("La persona se creo exitosamente"), HttpStatus.OK);
     }
     
     @PutMapping("editar/{id}")
     
     public ResponseEntity<?> editarProducto(@PathVariable("id") int id, @RequestBody ProductoDto productoDto){
         
         Productos producto = productoService.buscaProductoPorId(id).get();
         
         producto.setNombreProducto(productoDto.getNombre_producto());
         producto.setImagenProducto(producto.getImagenProducto());
         producto.setDescripcionProducto(productoDto.getDescripcion_producto());
         producto.setPrecioProducto(productoDto.getPrecioProducto());
         
         productoService.guardarProducto(producto);
         
         
         return new ResponseEntity<>(new Mensaje("EL producto se actualizo con exito"),HttpStatus.OK);
     
     }
     
     @DeleteMapping("delete/{id}")
     
     public ResponseEntity<?> borrarProducto(@PathVariable("id") int id){
         productoService.eliminarProducto(id);
         
         return new ResponseEntity<>( new Mensaje("El producto ha sido eliminado"), HttpStatus.OK);
     }
     
     
     
    
}
