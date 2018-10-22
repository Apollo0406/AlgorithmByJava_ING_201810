package Queue.basicQueue;

import java.awt.desktop.SystemSleepEvent;

public class queue {
    private int[] q;
    private int top,tail,maxSize,nElem;

    public queue(int size){
        maxSize = size;
        q = new int[maxSize];
        top = 0;
        tail = -1;
        nElem = 0;
    }

    public boolean isEmpty(){
        return (nElem == 0);
    }

    public boolean isFull(){
        return (nElem == maxSize);
    }

    public int getSize(){
        return nElem;
    }

    public void push(int value){
        if(!isFull()) {
            if (tail == maxSize - 1)
                tail = -1;  //循环队列处理
            q[++tail] = value;
            nElem++;
        }
    }

    public int peek(){
        return q[top];
    }

    public int pop(){
        return q[top++];
    }

    public void print(){
        System.out.print("queue:{");
        for(int i = top ; i < tail; i++){
            System.out.print(q[i]+" ");
        }
        System.out.println("}");
    }
}
