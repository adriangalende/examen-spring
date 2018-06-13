package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
