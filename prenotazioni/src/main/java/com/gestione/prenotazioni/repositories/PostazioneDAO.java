package com.gestione.prenotazioni.repositories;

import com.gestione.prenotazioni.entities.Postazione;
import com.gestione.prenotazioni.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}
