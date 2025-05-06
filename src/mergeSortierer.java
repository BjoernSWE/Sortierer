import java.util.ArrayList;

public class mergeSortierer extends Sortierer {

    mergeSortierer(ArrayList<Integer> jahreszahlen) {
        super(jahreszahlen);
    }

    protected ArrayList<Integer> sortiere(ArrayList<Integer> liste) {
        if (liste.size() <= 1) {
            return liste;
        }

        int mid = liste.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(liste.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(liste.subList(mid, liste.size()));

        left = sortiere(left);
        right = sortiere(right);

        return merge(left, right);
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size())
            result.add(left.get(i++));
        while (j < right.size())
            result.add(right.get(j++));

        return result;
    }
}