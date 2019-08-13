package ro.itschool.mvnbase.homeWorkCurs20.searchingAlgo;

import java.util.Arrays;

public class GenericBinarySearch <T extends Comparable<T>>{
    public boolean binarySearch(T[] elems,int size, T elem) {
        if (elems==null){
            return false;
        }
        if (size==0){
            return false;
        }
        if (elems[size/2].compareTo(elem)==0){
            return true;
        }else if(elem.compareTo(elems[size/2])<0) {
            return search(Arrays.copyOfRange(elems,0,elems.length/2),elem,size);
        }else if (elem.compareTo(elems[size/2])>0){
            return search(Arrays.copyOfRange(elems,size/2+1,elems.length),elem,size);
        }
        return false;
    }

    public boolean search(T[] elems, T elem,int size) {
        if (elems==null){
            return false;
        }
        for (int i=0;i<size;i++){
            if (elems[i].compareTo(elem)==0){
                return true;
            }
        }
        return false;
    }
}
