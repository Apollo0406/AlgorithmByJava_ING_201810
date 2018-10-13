package selectSort;

public class arraySelect {
    long[] a;
    int nElem;

    public arraySelect(int max){
        a = new long[max];
    }

    public void insert(long value){
        a[nElem] = value;
        nElem++;
    }

    //选择排序的精髓在于，比较完一趟只交换一次
    public void selectSort(){
        int out,in,min;

        for(out=0;out<nElem-1;out++) {
            min = out;
            for (in = out+1;in<nElem;in++){
                if(a[in]<a[min]){
                    min = in;
                }
            }
            swap(out,min);
        }
    }

    private void swap(int one,int two){
        long temp;
        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void display(){
        System.out.print("a[]={");
        for(int i=0; i<nElem;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("}");
    }
}
