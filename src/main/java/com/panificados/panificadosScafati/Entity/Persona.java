package com.panificados.panificadosScafati.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @NotNull
   @Size(min = 1, max = 50, message = "El nombre debe tener entre 1 y 50 caracteres")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "El apellido debe tener entre 1 y 50 caracteres")
   private String apellido;
    @NotNull
    @Size(min = 1, max = 100, message = "El email debe tener entre 1 y 50 caracteres")
    private String email;
    @NotNull
    private String telefono;
    @NotNull
    private String direccion;
    @NotNull
    private String imagen;
    @NotNull
    @Size(min = 1, max = 1000, message = "El mensaje debe contener al menos un caracter y maximo 1000 caracteres")
    private String descripcion;
    @NotNull
    private String presentacion;
    @NotNull
    private String sobreNosotros;




    //Constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String telefono, String direccion, String imagen, String descripcion, String presentacion, String sobreNosotros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.sobreNosotros = sobreNosotros;

    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getSobreNosotros() {
        return sobreNosotros;
    }

    public void setSobreNosotros(String sobreNosotros) {
        this.sobreNosotros = sobreNosotros;
    }

//Geters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
