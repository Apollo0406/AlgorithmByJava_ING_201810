package OrderArray;
//有序数组的二分查询、删除、及添加
public class OrdArray {
    private long[] a;
    private int nElem;

    public OrdArray(int max) {
        a = new long[max];
        nElem = 0;
    }

    public int size() {
        return nElem;
    }

    //-----------将俩个有序源数组合并成一个有序目的数组----------
    public void merge(long[] a,long[] b){

    }

    //--------给数组随机赋值，并保证有序-----------------------
    public long[] randomCreate(long[] arr){
        int i;
        arr[0] = (long)Math.random();
        for(i=1;i<arr.length;i++){
            if(arr[i]>arr[i+1])
                 arr[i] = (long)(Math.random());
        }
        return arr;
    }

    //------------二分法find()--------------
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElem - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElem;
            } else {
                if (a[curIn] > searchKey) {
                    upperBound = curIn - 1;
                } else {
                    lowerBound = curIn + 1;
                }
            }
        }
    }
    //------------二分法find()end-----------

    //将普通的遍历改为二分法
    public void insert(long value) {
        int i;
        for (i = 0; i < nElem; i++) {
            if (a[i] > value) {
                break;
            }
        }
        for (int k = nElem; k > i; k--) {
            a[k] = a[k - 1];
        }
        a[i] = value;
        nElem++;
    }
//--------------------二分法插入一个数--------------------------
    public void insert2(long value){
        //二分查找比较大小
        int lowerBound = 0;
        int upperBound = nElem-1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound)/2;
            //先将中间数值与待插入的数值做比较，如果大于，则将范围缩小到前一半
            //假设不允许重复
            if(value > a[curIn] && value < a[curIn + 1] )
                break;
            else if(a[curIn]>value)
                upperBound = curIn - 1;
            else
                lowerBound = curIn + 1;

        }
        for (int k = nElem; k > curIn+1; k--) {
            a[k] = a[k - 1];
        }
        a[curIn+1] = value;
        nElem++;

    }
    //-----------------二分法插入结束-------------------------------

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElem){
            System.out.println("Can not find :" + value);
            return false;
        }
        else{
            for (int k = j; k < nElem; k++) {
                a[k] = a[k + 1];
            }
            nElem--;
            return true;
        }
    }

    //------------二分法delete()--------------
   /* public boolean delete2(long value){
        int j = find(value); //返回索引

    }*/
    //------------二分法delete()end-----------

    public void display(){
        for(int i = 0; i < nElem ; i++){
            System.out.print(a[i]+"  ");
            System.out.println();
        }
    }
}

