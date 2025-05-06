import java.util.ArrayList;
import java.util.Collections;

public class quickSortierer extends Sortierer {

    quickSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {
        long start = System.currentTimeMillis();
        long end = 0;
        long Dauer = 0;
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
        end = System.currentTimeMillis();
        Dauer = getOperations(start, end);
        Ausgabe.liste(liste);
        Ausgabe.zeit(Dauer);
        return liste;
    }
}
