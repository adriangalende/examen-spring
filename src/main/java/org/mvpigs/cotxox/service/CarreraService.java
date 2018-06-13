package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class CarreraService {
    @Autowired
    CarreraRepo carreraRepo;

    public Long crearCarrera(String tarjeta, String origen, String destino, int tiempoEsperado, int tiempoCarrera){
        Carrera carrera = new Carrera();
        carrera.setTarjetaCredito(tarjeta);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setTiempoEsperado(tiempoEsperado);
        carrera.setTiempoCarrera(tiempoCarrera);
        carreraRepo.save(carrera);
        return carrera.getId();
    }

    public Carrera recuperaCarrera(Long idCarrera){
        return carreraRepo.findOne(idCarrera);
    }

    //Al realizar un CrudRepository, el método save nos sirve tanto para insertar una nueva carrera, como para
    // realizar un update en caso de que la carrera exista ( managed )
    public void updateCarrera(Carrera carrera){
        carreraRepo.save(carrera);
    }

    public Double obtenerMediaPuntos(String nombre){
        return carreraRepo.obtenerMediaPuntos(nombre);
    }
}
