package Riccardo.Classi;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    // ATTRIBUTI
    private List<Libri> libri;
    private List<Riviste> riviste;

    // COSTRUTTORE
    public Catalogo(List<Libri> libri, List<Riviste> riviste) {
        this.libri = libri;
        this.riviste = riviste;
    }

    // METODI
    // RICERCA PER ISBN
    public List<Libri> searchBooksByCodiceISBN(String isbn){
     return  this.libri.stream().filter(codice -> codice.getCodiceISBN().equals(isbn)).toList();
    }
    public List<Riviste> searchMagazinesByCodiceISBN(String isbn){
        return  this.riviste.stream().filter(codice -> codice.getCodiceISBN().equals(isbn)).toList();
    }

    // RICERCA PER ANNO DI PUBBLICAZIONE
    public List<Libri> searchBooksByYears(int anno){
        return this.libri.stream().filter(pubblicazione -> pubblicazione.getAnnoPubblicazione() == anno).toList();
    }
    public List<Riviste> searchMagazinesByYears(int anno){
        return this.riviste.stream().filter(pubblicazione -> pubblicazione.getAnnoPubblicazione() == anno).toList();
    }
    // RICERCA PER AUTORE
    public List<Libri> searchByAuthor(String autore){
        return this.libri.stream().filter(aut -> aut.getAutore().equals(autore)).toList();
    }
}
