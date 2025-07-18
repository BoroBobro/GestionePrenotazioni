package com.gestione.prenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "prenotazioni")
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Postazione postazione;
    private LocalDate data;

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
