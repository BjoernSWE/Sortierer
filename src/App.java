import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> jahreszahlen = new ArrayList<>();
        int anzahl = 5000;
        int min = 1900;
        int max = 2013;

        for (int i = 0; i < anzahl; i++) {
            int jahr = min + (int) (Math.random() * (max - min + 1));
            jahreszahlen.add(jahr);
        }

        System.out.println("Unsortierte Liste:");
        Ausgabe.liste(jahreszahlen);
        System.out.println();

        Ausgabe.insertSort();
        insertSortierer insertsorter = new insertSortierer(jahreszahlen);
        insertsorter.sortiere(jahreszahlen);
        System.out.println();

        Ausgabe.quickSort();
        quickSortierer quicksorter = new quickSortierer(jahreszahlen);
        quicksorter.sortiere(jahreszahlen);
        System.out.println();

        Ausgabe.mergeSort();
        mergeSortierer mergesorter = new mergeSortierer(jahreszahlen);
        mergesorter.sortiere(jahreszahlen);
        System.out.println();
    }
}
