package MaxHighArray;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public int  getMax(){
        int i,index=0;
        long max=a[0];
        if(nElems==0)
            return -1;
        for(i=1;i<nElems;i++){
            if(a[i]>max){
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public void removeMax(){
        int i,index=0;
        long max=a[0];
        if(nElems==0)
            System.out.println("empty array");
        for(i=1;i<nElems;i++){
            if(a[i]>max){
                max = a[i];
                index = i;
            }
        }
        //删除最大值
        System.out.println("max="+a[index]);
        delete(a[index]);
    }

    public long get(int index){
        int i;
        for(i=0;i<nElems;i++){
            if(i == index)
                return a[i];
        }
        return 0;
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
