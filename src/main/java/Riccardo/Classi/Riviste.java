package Riccardo.Classi;

import Riccardo.Enum.Periodicita;

public class Riviste {
    // ATTRIBUTI
    private String codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    private Periodicita periodicita;

    // COSTRUTTORE
    public Riviste(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.periodicita = periodicita;
    }

    // GETTER
    public String getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }
    // ToString

    @Override
    public String toString() {
        return "Riviste {" +
                "codiceISBN = '" + codiceISBN + '\'' +
                ", titolo = '" + titolo + '\'' +
                ", annoPubblicazione = " + annoPubblicazione +
                ", numeroPagine = " + numeroPagine +
                ", periodicita = " + periodicita +
                '}';
    }
}
