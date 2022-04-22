package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Docente extends Persona{

    @Column (name = "iddocente",length = 10, nullable = false)
    private Long idDocente;
    @Column( name = "curso", length = 100)
    private String Curso;

    public Docente() {
    }

    public Docente(Long idDocente, String curso) {
        this.idDocente = idDocente;
        Curso = curso;
    }

    public Docente(Long idPersona, Long idDocente, String curso) {
        super(idPersona);
        this.idDocente = idDocente;
        Curso = curso;
    }

    public Docente(String nombre, String apellido, String edad, String dni, Date fechaNacimiento, String genero, Long idDocente, String curso) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.idDocente = idDocente;
        Curso = curso;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }
}
