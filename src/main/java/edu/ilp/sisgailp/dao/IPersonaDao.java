package edu.ilp.sisgailp.dao;



import edu.ilp.sisgailp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IPersonaDao extends JpaRepository<Persona,Long>{

    @Query("SELECT e FROM Persona e WHERE e.dni = :dni")
    Persona obtenerPersonaPorParam(@Param("dni") String dni);
}
