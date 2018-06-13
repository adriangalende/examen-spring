package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CarreraRepo extends CrudRepository<Carrera, Long> {

    @Query("select conductor from Carrera carrera join carrera.conductor conductor where carrera.conductor.nombre = ?1")
    public List<Conductor> obtenerMediaPuntos(String nombre);


}
