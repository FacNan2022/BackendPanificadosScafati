package com.panificados.panificadosScafati.Dto;

import javax.validation.constraints.NotBlank;

public class PersonaDto {
   @NotBlank
    private String nombre;
   @NotBlank
   private String apellido;
   @NotBlank
   private String email;
   @NotBlank
   private String telefono;
   @NotBlank
   private String direccion;
   @NotBlank
   private String imagen;
   @NotBlank
    private String descripcion;
   @NotBlank
   private String presentacion;
   @NotBlank
   private String sobreNosotros;

   //constructores


    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String email, String telefono, String direccion, String imagen, String descripcion, String presentacion, String sobreNosotros) {
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
//getters y setters


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

