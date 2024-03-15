package Riccardo.Classi;

public class Libri {
    // ATTRIBUTI
    private int codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    private String autore;
    private String genere;

    // COSTRUTTORE
    public Libri(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.genere = genere;
    }
}
