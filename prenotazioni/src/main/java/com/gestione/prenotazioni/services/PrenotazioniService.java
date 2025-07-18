package com.gestione.prenotazioni.services;

import com.gestione.prenotazioni.entities.Postazione;
import com.gestione.prenotazioni.entities.Prenotazione;
import com.gestione.prenotazioni.entities.Utente;
import com.gestione.prenotazioni.repositories.PrenotazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioniService {

    @Autowired
    private PrenotazioneDAO prenotazioneDAO;

    public void save(Prenotazione prenotazione) {
        prenotazioneDAO.save(prenotazione);
    }

    public List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data) {
        return prenotazioneDAO.findByPostazioneAndData(postazione, data);
    }

    public List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data) {
        return prenotazioneDAO.findByUtenteAndData(utente, data);
    }

    public void delete(Prenotazione prenotazione) {
        prenotazioneDAO.delete(prenotazione);
    }
}
