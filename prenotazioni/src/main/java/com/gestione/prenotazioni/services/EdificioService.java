package com.gestione.prenotazioni.services;

import com.gestione.prenotazioni.entities.Edificio;
import com.gestione.prenotazioni.repositories.EdificioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdificioService {

    @Autowired
    private EdificioDAO edificioDAO;

    public void save(Edificio edificio) {
        edificioDAO.save(edificio);
    }

    public List<Edificio> findAll() {
        return edificioDAO.findAll();
    }
}
