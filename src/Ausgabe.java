import java.util.ArrayList;

public class Ausgabe {

    public static void liste(ArrayList<Integer> jahreszahlen) {
        int zaehler = 0;

        for (int i = 0; i < jahreszahlen.size(); i++) {
            System.out.print(jahreszahlen.get(i) + " ");
            if ((i + 1) % 30 == 0) {
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
        double dauer = Dauer / 1000.0;
        System.out.println("Sortierung dauerte: " + dauer + "s");
    }
}
