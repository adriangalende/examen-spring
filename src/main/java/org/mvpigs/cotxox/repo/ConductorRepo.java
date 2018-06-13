package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConductorRepo extends CrudRepository<Conductor, String> {

    public List<Conductor> findByOcupado(int ocupado);

    @Query("select conductor.valoracionMedia from Conductor conductor where conductor.nombre = ?1")
    public List<Double> obtenerValoracionMedia(String nombre);


}
