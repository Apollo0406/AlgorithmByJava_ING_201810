package arrayqueue;

import jdk.nashorn.internal.runtime.ECMAException;

/**
 * 用数组模拟队列（一次性队列）
 */

public class arrayQueue {

    //maxSize
    int maxSize;

    int front = -1;

    int rear= -1;

    Object[] arrQueue;

    //构造器创建一定长度的数组
    public arrayQueue(int n){
        maxSize = n;
        Object[] arrQueue =  new Object[n];

    }

    //队列是否为空
    public boolean isEmpty(){
        return front == rear;
    }

    //队列是否为满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    //入队列
    public void add(Object ob){
        if(isFull()){
            System.out.println("队列满，无法添加！");
            return;
        }
        //若不满，直接rear+1；再放进来
        rear++;
        arrQueue[rear] = ob;
    }

    //出队列
    public Object out()  {
        if(isEmpty()){
            throw new RuntimeException("队列空，无法取出");
        }
        front++;
        return arrQueue[front];
    }

    //show
    public void show(){
        if(isEmpty()){
            System.out.println("空，无法show");
            return;
        }
        for(int i = front+1; i <= rear; i++){
            System.out.println(arrQueue[i]);
        }
    }

 /*   //计算有效数据个数
    public int size(){
        return rear - front;
    }*/
}
