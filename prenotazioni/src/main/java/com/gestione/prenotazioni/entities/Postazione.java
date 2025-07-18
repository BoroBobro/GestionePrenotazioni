package com.gestione.prenotazioni.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codice;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    private int maxOccupanti;

    @OneToMany(mappedBy = "edificio")
    private Edificio edificio;


    public Postazione(String codice, String descrizione, Edificio edificio, int maxOccupanti, TipoPostazione tipoPostazione) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.edificio = edificio;
        this.maxOccupanti = maxOccupanti;
        this.tipo = tipoPostazione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxOccupanti() {
        return maxOccupanti;
    }

    public void setMaxOccupanti(int maxOccupanti) {
        this.maxOccupanti = maxOccupanti;
    }

    public TipoPostazione getTipoPostazione() {
        return tipo;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipo = tipoPostazione;
    }

    @Override
    public String toString() {
        return "Postazione{" +
                "codice='" + codice + '\'' +
                ", id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipo +
                ", maxOccupanti=" + maxOccupanti +
                ", edificio=" + edificio +
                '}';
    }
}
