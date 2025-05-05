import java.util.ArrayList;
import java.util.Collections;

public class quickSortierer extends Sortierer {

    quickSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {
        int links = 0;
        int rechts = liste.size() - 1;
        int pivot = liste.get(liste.size() / 2);
        do {
            while (liste.get(links) < pivot) {
                links++;
            }
            while (liste.get(rechts) > pivot) {
                rechts--;
            }
            if (links <= rechts) {
                Collections.swap(liste, links, rechts);
                links++;
                rechts--;
            }
        } while (links <= rechts);
        Ausgabe.liste(liste);
        return liste;
    }
}
