package LowArray;

class LowArray {
    private long[] a;
    //construction
    public LowArray(int size){
        a = new long[size];
    }
    //set value
    public void setElem(int index,long value){
        a[index] = value;
    }
    //get value
    public long getElem(int index){
        return a[index];
    }
}
