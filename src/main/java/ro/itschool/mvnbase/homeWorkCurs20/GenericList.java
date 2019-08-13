package ro.itschool.mvnbase.homeWorkCurs20;

public class GenericList<T extends Comparable<T>> {


    private T[] values;
    private int size;

    public GenericList() {
        this.values = (T[]) new Object[10];
        this.size = 0;
    }

    public T get(int index){
        if (index >size-1){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return values[index];
    }

    public void add(T value){
        this.values=moreCapacity();
        this.values[size]=value;
        size++;
    }

    private T[] moreCapacity() {
        if (this.size==values.length){
            T[]copyT=(T[]) new Object[size+10];
            for (int i = 0; i < size; i++) {
                copyT[i] = values[i];
            }
            return copyT;
        }else {
            return values;
        }
    }

    public int size(){
        return size;
    }

    public T[] getValues(){
        return values;
    }


}
