package bubbleSort;

public class arrayBubble {
    long[] a;
    int nElem;

    public arrayBubble(int maxsize){
        a = new long[maxsize];
        nElem = 0;
    }

    public void insert(long value){
        a[nElem] = value;
        nElem++;
    }

    public void bubbleSort(){
        System.out.println("---the old algorithm----");
        int i,j;
        long temp;
        for(i=0;i<nElem;i++){
            for(j=0;j<nElem-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public void bubbleSort2(){
        //内外层控制换一种表达
        System.out.println("---another algorithm----");
        int out,in;
        long temp2;
        for(out = nElem-1;out>1;out--){
            for(in =0; in < out ;in++){
                if(a[in] > a[in+1]){
                    temp2 = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp2;
                }
            }
        }
    }

    public void display(){
        System.out.print("a[]:{");
     /*   for(long i: a){
            System.out.print( i+"," );
        }*/
     //注意如果拿增强for来遍历数组的话，拿到的就直接是数组的元素值
        for(int i =0 ;i<nElem;i++)
            System.out.print( a[i]+"," );
        System.out.println("}");
    }
}
