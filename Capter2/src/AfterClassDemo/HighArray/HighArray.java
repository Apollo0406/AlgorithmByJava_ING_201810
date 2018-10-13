package HighArray;

public class HighArray {
    private int[] a;
    private int nElems;

    public HighArray(int max){
        a = new int[max];
        nElems = 0;
    }

    //-------NoDup()除重——------

    public void nodup(){
        int i;
        long[] b = new long[100];
        for(i=0;i<nElems;i++){
            if(b[a[i]]==0) //若是第一次出现，则置标志为1
                 b[a[i]] = 1;
            else{   //若不为0，则说明已经出现过，就删除
                for(int j = i;j<nElems-1;j++){
                    a[j] = a[j+1];
                }
                nElems--;
            }
        }
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

    public void insert(int value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(int value){
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
