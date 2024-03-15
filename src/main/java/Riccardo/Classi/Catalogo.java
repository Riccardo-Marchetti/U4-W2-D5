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

    // GETTER
    public List<Libri> getLibri() {
        return libri;
    }

    public List<Riviste> getRiviste() {
        return riviste;
    }

    // METODI
    // AGGIUNTA ELEMENTO
    public void aggiungiLibro(Libri libro){
        this.libri.add(libro);
    }
    public void aggiungiRivista(Riviste rivista){
        this.riviste.add(rivista);
    }
    // RIMOZIONE ELEMENTO
    public Libri rimuoviLibro(String isbn){
       List<Libri> lista =  this.libri.stream().filter(codice -> codice.getCodiceISBN().equals(isbn)).toList();
       this.libri.remove(lista.get(0));
       return lista.get(0);
    }
    public Riviste rimuoviRivista(String isbn){
        List<Riviste> rivista =  this.riviste.stream().filter(codice -> codice.getCodiceISBN().equals(isbn)).toList();
        this.riviste.remove(rivista.get(0));
        return rivista.get(0);
    }

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

    // ToString
    @Override
    public String toString() {
        return "Catalogo{" +
                "libri=" + libri +
                ", riviste=" + riviste +
                '}';
    }
}
