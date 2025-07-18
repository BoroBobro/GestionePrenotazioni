package com.gestione.prenotazioni.repositories;

import com.gestione.prenotazioni.entities.Postazione;
import com.gestione.prenotazioni.entities.Prenotazione;
import com.gestione.prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);

    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
}
