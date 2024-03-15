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
}
