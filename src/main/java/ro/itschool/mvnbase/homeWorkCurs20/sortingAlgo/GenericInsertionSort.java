package ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo;

public class GenericInsertionSort<T extends Comparable<T>> {
    public T[] insertionSort(T[] list, int size) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            insertElement(list, list[i], i - 1);
        }
        return list;
    }

    private int insertElement(T[] list, T toInsert, int j) {
        while (j >= 0 && list[j].compareTo(toInsert) > 0) {
            list[j + 1] = list[j];
            j = j - 1;
        }
        list[j + 1] = toInsert;
        return j;
    }
}
