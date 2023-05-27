package com.panificados.panificadosScafati.Controller;

import com.panificados.panificadosScafati.Dto.PersonaDto;
import com.panificados.panificadosScafati.Entity.Persona;
import com.panificados.panificadosScafati.Mensaje.Mensaje;
import com.panificados.panificadosScafati.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Panificados/")
@CrossOrigin(origins = {"https://panificadosscafati.web.app","http://localhost:4200"})
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("informacion")
    public ResponseEntity<List<Persona>> getAll() {
        List<Persona> personas = personaService.ListaPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id) {
        Persona persona = personaService.GetPersona(id).get();
        return new ResponseEntity<>(persona, HttpStatus.OK);

    }

    @PostMapping("create")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDto dtoPersona) {
        Persona persona = new Persona(dtoPersona.getNombre(), dtoPersona.getApellido(), dtoPersona.getEmail(), dtoPersona.getTelefono(),

                dtoPersona.getDireccion(), dtoPersona.getImagen(), dtoPersona.getDescripcion(), dtoPersona.getPresentacion(), dtoPersona.getSobreNosotros());
        personaService.AddPersona(persona);
        return new ResponseEntity<>(new Mensaje("Persona creada"), HttpStatus.OK);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<?> actualizarPersona(@PathVariable("id")int id, @RequestBody PersonaDto dtoPersona) {
        Persona persona = personaService.GetPersona(id).get();
        persona.setNombre(dtoPersona.getNombre());
        persona.setApellido(dtoPersona.getApellido());
        persona.setEmail(dtoPersona.getEmail());
        persona.setTelefono(dtoPersona.getTelefono());
        persona.setDireccion(dtoPersona.getDireccion());
        persona.setImagen(dtoPersona.getImagen());
        persona.setDescripcion(dtoPersona.getDescripcion());
        persona.setPresentacion(dtoPersona.getPresentacion());
        persona.setSobreNosotros(dtoPersona.getSobreNosotros());
        personaService.AddPersona(persona);
        return new ResponseEntity<>(new Mensaje("Persona actualizada"), HttpStatus.OK);

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> eliminarPersona(@PathVariable("id")int id) {
        personaService.DeletePersona(id);
        return new ResponseEntity<>(new Mensaje("Persona eliminada"), HttpStatus.OK);
    }


}
