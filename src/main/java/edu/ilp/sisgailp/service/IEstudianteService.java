package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    //Listar todas los Estudiantes
    List<Estudiante> listarEstudiantes();

    //Obtener estudiante por codigo
    Estudiante obtenerEstudiantePorCodigo(Long codigo);

}
