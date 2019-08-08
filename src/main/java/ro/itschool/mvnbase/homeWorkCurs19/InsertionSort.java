package ro.itschool.mvnbase.homeWorkCurs19;

public class InsertionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems==null){
            return null;
        }
        for (int i = 1; i < elems.length; ++i) {
            int value = elems[i];
            int contor = i - 1;

            while (contor >= 0 && elems[contor] > value) {
                elems[contor + 1] = elems[contor];
                contor = contor - 1;
            }
            elems[contor + 1] = value;
        }
        return elems;
    }
}
