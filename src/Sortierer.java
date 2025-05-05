import java.util.ArrayList;

public abstract class Sortierer {

    private ArrayList<Integer> liste;

    public Sortierer(ArrayList<Integer> jahreszahlen) {
        this.liste = new ArrayList<>(jahreszahlen);
    }

    protected abstract ArrayList<Integer> sortiere(ArrayList<Integer> liste);

    public ArrayList<Integer> sortiere() {
        long start = System.currentTimeMillis();
        long end = 0;
        sortiere(liste);
        end = System.currentTimeMillis();
        getOperations(start, end);
        return liste;
    }

    public long getOperations(long start, long end) {
        long Dauer = end - start;
        return Dauer;
    }
}
