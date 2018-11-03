package binarySearchDemo;

public class ordArray {
    private long[] a;
    private int nElem;

    public ordArray(int max){
        a = new long[max];
        nElem = 0;
    }

    public int size(){
        return nElem;
    }

    public int find(long searchKey){
        return recFind(searchKey,0,nElem-1);
    }

    public int recFind(long searchKey,int lowerBound,int upperBound){
        int curIn;

        curIn = (lowerBound + upperBound)/2;
        if(a[curIn] == searchKey)
            return curIn;
        else if(lowerBound > upperBound)
            return nElem;
        else {
            if (lowerBound < upperBound)
                return recFind(searchKey,curIn+1,upperBound);
            else
                return recFind(searchKey,lowerBound,curIn-1);
        }
    }

    public void insert(long value){
        int j;
        for(j =0 ; j<nElem;j++){
            if(a[j] > value)
                break;
        }
        for(int k = nElem; k>j; k--){
            a[k] = a[k-1];
        }
        a[j] = value;
        nElem++;
    }

    public void display(){
        for(int j = 0; j < nElem;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println(" ");
    }
}
