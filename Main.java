package org.example;

import org.example.*;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> utenti = Arrays.asList("Simone", "Marco", "Lucia");
        User user = new User("Simone Romano", "blalbla");
        Bacheca bacheca=new Bacheca(TitoloBacheca.UNIVERSITA,"Forza Napoli");
        ToDo todo = new ToDo("bianco","blu", 1, "Studiare Java","Compito 1","https://esempio.com", utenti,false, 1,"2025-04-30", "sei bello" ,Mansione.AUTORE);
        System.out.println("Benvenuto in ToDo!!!");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Bacheca: "+ bacheca.getTitolo());
        System.out.println("Descrizione: "+bacheca.descrizione);
        System.out.println("📝 ToDo Creato:");
        System.out.println("ID: " + todo.getId());
        System.out.println("Titolo: " + todo.titolo);
        System.out.println("Descrizione: " + todo.descrizione);
        System.out.println("Colore Sfondo: " + todo.coloreSfondo);
        System.out.println("Colore Titolo: " + todo.coloreTitolo);
        System.out.println("URL: " + todo.url);
        System.out.println("Data Scadenza: " + todo.dataScadenza);
        System.out.println("Completato? " + (todo.state ? "Sì" : "No"));
        System.out.println("Posizione: " + todo.posizione);
        System.out.println("Immagine: "+ todo.immagine);
        System.out.println("Mansione: " + todo.getMansione());
        System.out.println("Utenti associati: " + todo.listaUtenti);
    }
}