package demo_chien_binh;

import java.util.Comparator;

public class CompaByName  implements Comparator<ChienBinhDepTrai> {
    @Override
    public int compare(ChienBinhDepTrai o1, ChienBinhDepTrai o2) {
        return o2.getTen().compareTo(o1.getTen());
    }
}
