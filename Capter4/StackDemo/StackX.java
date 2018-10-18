package StackDemo;

public class StackX {
    private long[] a;
    private int top;
    private int maxSize;

    public StackX(int size){
        maxSize = size;
        a = new long[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    public void push(long value){
        a[++top] = value;
    }

    public long pop(){
        return a[top--];
    }

    public long peek(){
        return a[top];
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
