package ro.itschool.mvnbase.homeWorkCurs6;

public class Concat {

    public int[] concatArray(int[]array1,int[]array2){
        int newArrayLenght=array1.length+array2.length;
        int[] newArray=new int[newArrayLenght];
        int index=0;

        for (int i=0;i<array1.length ;i++ ) {
            newArray[index]=array1[i];
            index++;
        }
        for (int i=0;i<array2.length ;i++ ) {
            newArray[index]=array2[i];
            index++;
        }

        return newArray;
    }

}
