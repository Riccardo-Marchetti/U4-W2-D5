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
        Libri libro1 = new Libri(24342, "libro1", 2020, 260, "Riccardo", "Fantasy");
        Libri libro2 = new Libri(57483, "libro1", 2020, 260, "Riccardo", "Avventura e azione");
        Libri libro3 = new Libri(34502, "libro1", 2020, 260, "Riccardo", "Thriller");
        Libri libro4 = new Libri(71243, "libro1", 2020, 260, "Riccardo", "Fantascienza");
        Libri libro5 = new Libri(83645, "libro1", 2020, 260, "Riccardo", "Horror");
        Libri libro6 = new Libri(98437, "libro1", 2020, 260, "Riccardo", "Fantasy");
        // LISTA DI LIBRI
        List<Libri> listaLibri = new ArrayList<>();
        listaLibri.add(libro1);
        listaLibri.add(libro2);
        listaLibri.add(libro3);
        listaLibri.add(libro4);
        listaLibri.add(libro5);
        listaLibri.add(libro6);

        // CREAZIONE RIVISTE
        Riviste rivista1 = new Riviste(18473, "libro1", 2020, 260, Periodicita.SETTIMANALE);
        Riviste rivista2 = new Riviste(20485, "libro1", 2020, 260, Periodicita.MENSILE);
        Riviste rivista3 = new Riviste(37549, "libro1", 2020, 260, Periodicita.SEMESTRALE);
        Riviste rivista4 = new Riviste(42528, "libro1", 2020, 260, Periodicita.MENSILE);
        Riviste rivista5 = new Riviste(51237, "libro1", 2020, 260, Periodicita.SEMESTRALE);
        Riviste rivista6 = new Riviste(81349, "libro1", 2020, 260, Periodicita.SETTIMANALE);
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

    }
}
