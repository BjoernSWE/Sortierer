import java.util.ArrayList;
import java.util.Collections;

public class quickSortierer extends Sortierer {

    quickSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {
        long start = System.currentTimeMillis();
        quickSort(liste, 0, liste.size() - 1);
        long end = System.currentTimeMillis();
        Ausgabe.liste(liste);
        Ausgabe.zeit(end - start);
        return liste;
    }

    private void quickSort(ArrayList<Integer> liste, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(liste, low, high);
            quickSort(liste, low, pivotIndex - 1);
            quickSort(liste, pivotIndex + 1, high);
        }
    }

    private int partition(ArrayList<Integer> liste, int low, int high) {
        int pivot = liste.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (liste.get(j) < pivot) {
                i++;
                Collections.swap(liste, i, j);
            }
        }
        Collections.swap(liste, i + 1, high);
        return i + 1;
    }
}
