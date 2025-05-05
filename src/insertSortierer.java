import java.util.ArrayList;

public class insertSortierer extends Sortierer {

    insertSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {
        for (int i = 1; i < liste.size(); i++) {
            int aktuellesElement = liste.get(i);
            int j = i - 1;

            while (j >= 0 && liste.get(j) > aktuellesElement) {
                liste.set(j + 1, liste.get(j));
                j--;
            }

            liste.set(j + 1, aktuellesElement);
        }
        Ausgabe.liste(liste);
        return liste;
    }
}
