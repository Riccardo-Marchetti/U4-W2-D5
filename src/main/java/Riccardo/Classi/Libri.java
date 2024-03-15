package Riccardo.Classi;

public class Libri {
    // ATTRIBUTI
    private String codiceISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    private String autore;
    private String genere;

    // COSTRUTTORE
    public Libri(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
        this.autore = autore;
        this.genere = genere;
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

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }
    // ToString
    @Override
    public String toString() {
        return "Libri {" +
                "codiceISBN = '" + codiceISBN + '\'' +
                ", titolo = '" + titolo + '\'' +
                ", annoPubblicazione = " + annoPubblicazione +
                ", numeroPagine = " + numeroPagine +
                ", autore = '" + autore + '\'' +
                ", genere = '" + genere + '\'' +
                '}';
    }
}
