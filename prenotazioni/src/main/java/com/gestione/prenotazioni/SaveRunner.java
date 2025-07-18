package com.gestione.prenotazioni;

import com.gestione.prenotazioni.entities.*;
import com.gestione.prenotazioni.services.EdificioService;
import com.gestione.prenotazioni.services.PostazioneService;
import com.gestione.prenotazioni.services.PrenotazioniService;
import com.gestione.prenotazioni.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SaveRunner implements CommandLineRunner {

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private PrenotazioniService prenotazioniService;

    @Override
    public void run(String... args) throws Exception {

        Edificio edificio = new Edificio("Chiesa di Giuseppe", "Via Maria", "Milano");
        edificioService.save(edificio);

        Postazione p1 = new Postazione("P1", "Postazione OpenSpace 1", edificio, 10, TipoPostazione.OPENSPACE);
        Postazione p2 = new Postazione("P2", "Sala Riunioni 1", edificio, 20, TipoPostazione.SALA_RIUNIONI);
        postazioneService.save(p1);
        postazioneService.save(p2);

        Utente utente = new Utente("mario.rossi@email.it", "Mario Rossi", "mario.rossi");
        Utente utente2 = new Utente("luca.rossi@email.it", "Luca Rossi", "luca.rossi");
        Utente utente3 = new Utente("giuseppe.rossi@email.it", "Giuseppe Rossi", "giuseppe.rossi");


        utenteService.save(utente);
        utenteService.save(utente2);
        utenteService.save(utente3);

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(p1);
        prenotazione.setData(LocalDate.now().plusDays(1));

        Prenotazione prenotazione1 = new Prenotazione();
        prenotazione1.setUtente(utente2);
        prenotazione1.setPostazione(p2);
        prenotazione1.setData(LocalDate.now().plusDays(2));

        prenotazioniService.save(prenotazione1);
        prenotazioniService.save(prenotazione);

        System.out.println("Dati di test inseriti correttamente.");
    }
}
