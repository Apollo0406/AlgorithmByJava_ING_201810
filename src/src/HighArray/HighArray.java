package HighArray;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int i;
        for(i=0;i<nElems;i++)
            if(a[i]==searchKey)
                break;
        if(i==nElems)
            return false;
        else
            return true;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int i;
        for(i=0;i<nElems;i++){
            if(a[i]==value)
                break;
        }
        if(i==nElems)
            return false;
        else{
            for(int j = i;j<nElems;j++){
                a[j]=a[j+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for(int i = 0; i < nElems; i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
