package com.gestione.prenotazioni.services;

import com.gestione.prenotazioni.entities.Postazione;
import com.gestione.prenotazioni.entities.TipoPostazione;
import com.gestione.prenotazioni.repositories.PostazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneDAO postazioneDAO;

    public void save(Postazione postazione) {
        postazioneDAO.save(postazione);
    }

    public List<Postazione> findByTipoAndCitta(TipoPostazione tipo, String citta) {
        return postazioneDAO.findByTipoAndEdificio_Citta(tipo, citta);
    }

    public List<Postazione> findAll() {
        return postazioneDAO.findAll();
    }
}
