import java.util.ArrayList;

public class mergeSortierer extends Sortierer {

    mergeSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    @Override
    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {

        long startTime = System.currentTimeMillis();

        ArrayList<Integer> sortedList = mergeSortHelper(liste);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        Ausgabe.liste(sortedList);
        Ausgabe.zeit(duration);

        return sortedList;
    }

    private ArrayList<Integer> mergeSortHelper(ArrayList<Integer> liste) {
        if (liste.size() <= 1) {
            return liste;
        }

        int mid = liste.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(liste.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(liste.subList(mid, liste.size()));

        left = mergeSortHelper(left);
        right = mergeSortHelper(right);

        return merge(left, right);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                merged.add(left.get(leftIndex++));
            } else {
                merged.add(right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex++));
        }

        return merged;
    }
}