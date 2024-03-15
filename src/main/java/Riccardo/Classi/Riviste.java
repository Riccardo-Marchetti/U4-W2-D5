package Riccardo.Classi;

import Riccardo.Enum.Periodicita;

public class Riviste {
    // ATTRIBUTI
    private int codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    private Periodicita periodicita;

    // COSTRUTTORE
    public Riviste(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicita = periodicita;
    }
}
