package org.example;

public class Bacheca {
    private TitoloBacheca titolo;
    protected String descrizione;

    public Bacheca(TitoloBacheca titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
    }

    public TitoloBacheca getTitolo() {
        return titolo;
    }

    public void setTitolo(TitoloBacheca titolo) {
        this.titolo = titolo;
    }

}
