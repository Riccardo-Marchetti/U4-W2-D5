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

}
