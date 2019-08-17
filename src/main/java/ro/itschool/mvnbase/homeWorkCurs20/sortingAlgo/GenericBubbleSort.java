package ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo;

public class GenericBubbleSort<T extends Comparable<T>> {
    public T[] bubbleSort(T[] list, int size) {
        if (list == null) {
            return null;
        }
        T temp;
        boolean sort = false;
        while (sort == false) {
            sort = true;
            for (int i = 0; i < size - 1; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    swap(list, i, i + 1);
                    sort = false;
                }
            }
        }
        return list;
    }

    private void swap(T[] elems, int first, int second) {
        T temp = elems[first];
        elems[first] = elems[second];
        elems[second] = temp;

    }


}
