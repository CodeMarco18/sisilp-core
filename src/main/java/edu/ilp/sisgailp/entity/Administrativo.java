package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Administrativo extends Persona{

    @Column (name = "idadministrador", length = 10,nullable = false)
    private Long idAdmin;
    @Column (name = "cargo",length = 50)
    private String cargo;

    public Administrativo(){

    }
    public Administrativo(Long idAdmin, String cargo) {
        this.idAdmin = idAdmin;
        this.cargo = cargo;
    }

    public Administrativo(Long idPersona, Long idAdmin, String cargo) {
        super(idPersona);
        this.idAdmin = idAdmin;
        this.cargo = cargo;
    }

    public Administrativo(String nombre, String apellido, String edad, String dni, Date fechaNacimiento, String genero, Long idAdmin, String cargo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.idAdmin = idAdmin;
        this.cargo = cargo;
    }

    public Long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
