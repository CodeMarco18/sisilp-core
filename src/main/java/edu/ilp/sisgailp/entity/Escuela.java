package edu.ilp.sisgailp.entity;

import javax.persistence.*;

@Entity
@Table(name = "escuela")
public class Escuela {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idescuela;

    private String denominacion;

    private Long codigoEscuela;

    public Escuela() {
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public Escuela(Long idescuela, String denominacion, Long codigoEscuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoEscuela = codigoEscuela;
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Long getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(Long codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }
}
