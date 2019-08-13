package ro.itschool.mvnbase.homeWorkCurs20.searchingAlgo;

public class GenericLinearSearch <T extends Comparable<T>> {
    public boolean linearSearch(T[] elems,int size, T elem) {
        if (elems==null){
            return false;
        }
        for (int i=0;i<size;i++){
            if (elems[i]==elem){
                return true;
            }
        }
        return false;
    }
}
