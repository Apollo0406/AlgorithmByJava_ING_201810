package circlearrayqueue;

/**
 * 数组模拟环形队列
 * front指向数组第一个有效数据；
 * rear指向最后一个数据的后一个
 * 满：(r+1)%m == f
 * 空：r == f
 * 个数：(r+m-f)%m
 */
public class circleArrayQueue {

    int[] array;
    int front;
    int rear;
    int maxSize;

    public circleArrayQueue(int n){
        front = 0;
        rear = 0;
        maxSize = n;
        array = new int[n];
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        return front == rear;
    }

    /**
     * 判满
     */
    public boolean isFull(){
        return (rear+1)%maxSize == front;
    }

    /**
     * add：入队一个元素
     */
    public void add(int n){
        if(isFull()){
            System.out.println("队列满，无法入队！");
            return;
        }
        array[rear] = n;
        rear = (rear+1)%maxSize;
    }

    /**
     * out：出队一个元素
     * 注意：队列只有一个元素时，出队操作要特殊对待：出队不用后移front，还需要把rear前移
     */
    public int out(){
        if(isEmpty()){
            throw new RuntimeException("队列空，无法出队！");
        }
        if(size() == 1){
            rear = (rear-1)%maxSize;
            return array[front];
        }
        int value = array[front];
        front = (front+1)%maxSize;
        return value;
    }

    /**
     * show：打印队列中全部元素出队
     */
    public void show(){
        if(isEmpty()){
            System.out.println("队列空，无法show");
            return;
        }
        int i = front;
        while(i != rear){

            System.out.println(array[i]);
            i = (i+1)%maxSize;
        }
    }

    /**
     * size:获得环形队列中有效元素的个数
     */
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }
}
