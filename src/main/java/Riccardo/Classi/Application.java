package Riccardo.Classi;

import Riccardo.Enum.Periodicita;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Application {

    public static void main(String[] args) {

        // CREAZIONE LIBRI
        Libri libro1 = new Libri("24342", "libro1", 2020, 260, "Riccardo", "Fantasy");
        Libri libro2 = new Libri("57483", "libro2", 2023, 300, "Antonio", "Avventura e azione");
        Libri libro3 = new Libri("34502", "libro3", 2022, 180, "Luca", "Thriller");
        Libri libro4 = new Libri("71243", "libro4", 2019, 320, "Fabio", "Fantascienza");
        Libri libro5 = new Libri("83645", "libro5", 2012, 162, "Alberto", "Horror");
        Libri libro6 = new Libri("98437", "libro6", 2015, 235, "Fabio", "Fantasy");
        // LISTA DI LIBRI
        List<Libri> listaLibri = new ArrayList<>();
        listaLibri.add(libro1);
        listaLibri.add(libro2);
        listaLibri.add(libro3);
        listaLibri.add(libro4);
        listaLibri.add(libro5);
        listaLibri.add(libro6);

        // CREAZIONE RIVISTE
        Riviste rivista1 = new Riviste("18473", "rivista1", 2016, 40, Periodicita.SETTIMANALE);
        Riviste rivista2 = new Riviste("20485", "rivista2", 2018, 75, Periodicita.MENSILE);
        Riviste rivista3 = new Riviste("37549", "rivista3", 2020, 90, Periodicita.SEMESTRALE);
        Riviste rivista4 = new Riviste("42528", "rivista4", 2022, 82, Periodicita.MENSILE);
        Riviste rivista5 = new Riviste("51237", "rivista5", 2009, 33, Periodicita.SEMESTRALE);
        Riviste rivista6 = new Riviste("81349", "rivista6", 2011, 45, Periodicita.SETTIMANALE);
        // LISTA DI RIVISTE
        List<Riviste> listaRiviste = new ArrayList<>();
        listaRiviste.add(rivista1);
        listaRiviste.add(rivista2);
        listaRiviste.add(rivista3);
        listaRiviste.add(rivista4);
        listaRiviste.add(rivista5);
        listaRiviste.add(rivista6);

        // CREAZIONE CATALOGO CONTENENTE LIBRI E RIVISTE
        Catalogo catalogo = new Catalogo(listaLibri, listaRiviste);

        // AGGIUNTA ELEMENTO
        // LIBRI
        catalogo.aggiungiLibro( new Libri("29324", "libro7", 2000, 215, "Marco", "Avventura e azione"));
        // RIVISTE
        catalogo.aggiungiRivista(new Riviste("56367", "rivista7", 2007, 63, Periodicita.SETTIMANALE));

        // RICERCA PER CODICE ISBN
        System.out.println("----------------------- Ricerca per codice isbn -----------------------");
        // LIBRI
        List<Libri> libriCodiceISBN = catalogo.searchBooksByCodiceISBN("29324");
        System.out.println(libriCodiceISBN);
        // RIVISTE
        List<Riviste> rivisteCodiceISBN = catalogo.searchMagazinesByCodiceISBN("18473");
        System.out.println(rivisteCodiceISBN);

        // RICERCA PER ANNO DI PUBBLICAZIONE
        System.out.println("----------------------- Ricerca per anno di pubblicazione -----------------------");
        // LIBRI
        List<Libri> libriAnnoDiPubblicazione = catalogo.searchBooksByYears(2020);
        System.out.println(libriAnnoDiPubblicazione);
        // RIVISTE
        List<Riviste> rivisteAnnoDiPubblicazione = catalogo.searchMagazinesByYears(2020);
        System.out.println(rivisteAnnoDiPubblicazione);

        // RICERCA PER AUTORE
        System.out.println("----------------------- Ricerca per autore -----------------------");
        // LIBRI
        List<Libri> libriAutore = catalogo.searchByAuthor("Fabio");
        System.out.println(libriAutore);

    }
}
