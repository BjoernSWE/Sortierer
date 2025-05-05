import java.util.ArrayList;

public class Ausgabe {

    public static void liste(ArrayList<Integer> jahreszahlen) {
        int zaehler = 0;

        for (Integer zahl : jahreszahlen) {
            System.out.print(zahl + " ");
            zaehler++;

            if (zaehler % 30 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void mergeSort() {
        System.out.println("MergeSort:");
    }

    public static void quickSort() {
        System.out.println("QuickSort:");
    }

    public static void insertSort() {
        System.out.println("InsertSort:");
    }

    public static void zeit(long Dauer) {
        System.out.println("Sortierung dauerte: " + Dauer + "ms");
    }
}
