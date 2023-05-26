package com.panificados.panificadosScafati.Service;

import com.panificados.panificadosScafati.Entity.Persona;
import com.panificados.panificadosScafati.Interfaces.PersonaInterface;
import com.panificados.panificadosScafati.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonaService implements PersonaInterface {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> ListaPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> GetPersona(int id) {
        return personaRepository.findById(id);
    }

    @Override
    public void AddPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void DeletePersona(int id) {
        personaRepository.deleteById(id);

    }

    @Override
    public Boolean existePersona(String nombre) {
        return personaRepository.existsByNombre(nombre);
    }

    @Override
    public Boolean existeById(int id) {
        return personaRepository.existsById(id);
    }
}
