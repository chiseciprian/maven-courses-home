package ro.itschool.mvnbase.homeWorkCurs20.sortingAlgo;

public class GenericSelectionSort <T extends Comparable<T>> {
    public T[] selectionSort(T[] elems,int size) {
        if (elems==null){
            return null;
        }

        for (int i = 0; i < size-1; i++) {
            int minPos = foundMin(elems, i,size);
            swap(elems,i,minPos);
        }
        return elems;
    }

    private int foundMin(T[] arr, int pos,int size) {
        int minpos = pos;
        for (int i = pos; i < size; i++) {
            if (arr[i].compareTo(arr[minpos])<0) {
                minpos = i;
            }
        }
        return minpos;
    }

   private void swap(T[] elems, int first,int second) {
       T temp=elems[first];
       elems[first]=elems[second];
       elems[second]=temp;

    }
}
