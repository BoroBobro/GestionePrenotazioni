package com.gestione.prenotazioni.services;

import com.gestione.prenotazioni.entities.Utente;
import com.gestione.prenotazioni.repositories.UtenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    private UtenteDAO utenteDAO;

    public void save(Utente utente) {
        utenteDAO.save(utente);
    }

    public Optional<Utente> findByUsername(String username) {
        return utenteDAO.findByUsername(username);
    }

    public List<Utente> findAll() {
        return utenteDAO.findAll();
    }
}
