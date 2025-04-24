package org.example;

import java.util.List;

public class ToDo {
    private int id;
    protected String coloreSfondo;
    protected String coloreTitolo;
    protected String descrizione;
    protected String titolo;
    protected String url;
    protected List<String> listaUtenti;
    protected boolean state;
    protected int posizione;
    protected String dataScadenza;
    protected String immagine;
    private Mansione mansione;

    public ToDo (String coloreSfondo, String coloreTitolo, int id, String descrizione, String titolo, String url, List<String> listaUtenti, boolean state, int posizione, String dataScadenza, String immagine, Mansione mansione) {
        this.id = id;
        this.coloreSfondo = coloreSfondo;
        this.coloreTitolo = coloreTitolo;
        this.descrizione = descrizione;
        this.titolo = titolo;
        this.url = url;
        this.listaUtenti = listaUtenti;
        this.state = state;
        this.posizione = posizione;
        this.dataScadenza = dataScadenza;
        this.immagine=immagine;
        this.mansione = mansione;


    }

    public Mansione getMansione() {

        return mansione;
    }

    public void setMansione(Mansione mansione) {

        this.mansione = mansione;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

}
