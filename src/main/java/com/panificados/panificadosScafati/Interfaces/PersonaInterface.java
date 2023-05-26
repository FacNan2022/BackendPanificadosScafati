package com.panificados.panificadosScafati.Interfaces;

import com.panificados.panificadosScafati.Entity.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaInterface {
    public List<Persona> ListaPersonas();
    public Optional<Persona> GetPersona(int id);
    public void AddPersona(Persona persona);
    public void DeletePersona(int id);
    public Boolean existePersona(String nombre);
    public Boolean existeById(int id);

}
