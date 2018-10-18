package insertSort.usualSort;

public class insertArray {
    private long[] a;
    private long temp;
    private int nElem;

    public insertArray(int max){
        a = new long[max];
        nElem = 0;
    }

    public void insert(long value){
        a[nElem] = value;
        nElem++;
    }

    public void display(){
        System.out.print("a[]={");
        for(int i = 0; i < nElem; i++){
           System.out.print(a[i]+" ");
        }
        System.out.println("}");
    }

    public void insertSort(){
        int in,out;

        for(out = 1;out < nElem ;out++){
            in = out;
            temp = a[in];
            while(in > 0 && a[in-1] > temp){
                a[in] = a[in-1];
                in--;
            }
            a[in] = temp;
        }
    }
}
