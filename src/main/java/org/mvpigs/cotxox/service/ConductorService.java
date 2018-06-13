package org.mvpigs.cotxox.service;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.domain.PoolConductores;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConductorService {
    @Autowired
    ConductorRepo conductorRepo;



    /**
     *
     * 	 * String[] nombres = {"Sabrina", "Cici"};
     * 	 * String[] matricula = {"5DHJ444", "7JKK555"};
     * 	 * String[] modelos = {"Toyota Prius", "Mercedes A"}
     *
     *
     */

    public void init(){
        PoolConductores listaConductores = new PoolConductores();

        Conductor sabrina = new Conductor("2222222222222222");
        sabrina.setNombre("Sabrina");
        sabrina.setMatricula("5DHJ444");
        sabrina.setModelo("Toyota Prius");
        sabrina.setOcupado(false);

        listaConductores.getPoolConductores().add(sabrina);

        Conductor cici=new Conductor("3333333333333333");
        cici.setNombre("Cici");
        cici.setMatricula("7JKK555");
        cici.setModelo("Mercedes A");
        cici.setOcupado(false);

        listaConductores.getPoolConductores().add(cici);

        conductorRepo.save(listaConductores.getPoolConductores());

    }

    public Conductor recuperarConductor(String tarjeta){
        return conductorRepo.findOne(tarjeta);
    }

    public void anadirConductor(Conductor conductor){
        if(conductor != null) {
            conductorRepo.save(conductor);
        }
    }
}
