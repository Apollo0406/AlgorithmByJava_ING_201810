package mergeSortApp;

public class DArray {
    private long[] theArray;
    private int nElems;  //number of data items

    //利用构造函数创建数组
    public DArray(int max){
        theArray = new long[max];
        nElems = 0;
    }

    //向数组插入元素
    public void insert(long value){
        theArray[nElems] = value;
        nElems++;
    }

    //打印整个数组
    public void display(){
        for(int i = 0;i < nElems;i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println(" ");
    }

    public void mergeSort(){
        long[] workplace = new long[nElems];
        recMergeSort(workplace,0,nElems-1);
    }

    private void recMergeSort(long[] workplace,int lowerBound,int upperBound){
        if(lowerBound == upperBound)
            return;
        else{
            int mid = (lowerBound + upperBound)/2;
            recMergeSort(workplace,lowerBound,mid);
            recMergeSort(workplace,mid+1,upperBound);
            merge(workplace,lowerBound,mid+1,upperBound);
        }
    }

    private void merge(long[] workplace,int lowPtr,int highPtr,int upperBound){
        int j = 0;
        int lowBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowBound+1;

        while(lowPtr <= mid && highPtr <= upperBound){
            if(theArray[lowPtr] < theArray[highPtr])
                workplace[j++] = theArray[lowPtr++];
            else
                workplace[j++] = theArray[highPtr++];
        }

        while(lowPtr <= mid){
            workplace[j++] = theArray[lowPtr++];
        }

        while(highPtr <= upperBound){
            workplace[j++] = theArray[highPtr++];
        }

        for(j = 0;j < n;j++){
            theArray[lowBound+j] = workplace[j];
        }
    }
}
