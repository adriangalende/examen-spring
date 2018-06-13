package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CarreraRepo implements CrudRepository<Carrera, Long> {
    @Override
    public <S extends Carrera> S save(S s) {
        return null;
    }

    @Override
    public <S extends Carrera> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Carrera findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Carrera> findAll() {
        return null;
    }

    @Override
    public Iterable<Carrera> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Carrera carrera) {

    }

    @Override
    public void delete(Iterable<? extends Carrera> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
