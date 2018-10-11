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

    public void display(){
        for(int i = 0; i < nElem ; i++){
            System.out.print(a[i]+"  ");
            System.out.println();
        }
    }
}

