package com.gestione.prenotazioni.repositories;

import com.gestione.prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {
    Optional<Utente> findByUsername(String username);
}
