package com.gestione.prenotazioni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Utente {
    @Id

    private String username;
    private String nomeCompleto;
    private String email;

    public Utente(String email, String nomeCompleto, String username) {
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.username = username;
    }
}
