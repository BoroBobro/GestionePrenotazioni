package com.gestione.prenotazioni.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("Item with id " + id + " not found");
    }
}
