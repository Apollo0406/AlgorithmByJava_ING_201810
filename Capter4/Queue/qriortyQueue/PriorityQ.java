package Queue.qriortyQueue;

//优先级队列
public class PriorityQ {
    private int maxSize;
    private long[] p;
    private int nElem;

    public PriorityQ(int size){
        maxSize  = size;
        p = new long[maxSize];
        nElem = 0;
    }

    public void insert(long value){
        int j;
        //如果当前优先级队列为空，则存在第一个元素的位置
        if(nElem == 0)
            p[nElem++] = value;
        //如果队列已经不为空，则从最后元素开始遍历判断是否比当前位置大，大的话
        else{
            for(j = nElem-1; j>=0 ;j--){
                if(value < p[j])
                    p[j+1] = p[j];
                else
                    break;
            }
            p[j+1] = value;
            nElem++;
        }
    }

    public long remove(){
        return p[--nElem];
    }

    public long peekMin(){
        return p[nElem-1];
    }

    public boolean isEmpty(){
        return (nElem==0);
    }

    public boolean isFull(){
        return (nElem == maxSize);
    }
}
