package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Persona;

import java.util.List;

public interface IPersonaService {

    //Listar todas las Personas
    List<Persona> listarPersonas();

    //Obtener Persona por su DNI
    Persona obtenerPersonaPorDni(String dni);

}
