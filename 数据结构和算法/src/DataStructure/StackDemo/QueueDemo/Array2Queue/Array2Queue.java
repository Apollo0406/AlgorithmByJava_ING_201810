package DataStructure.StackDemo.QueueDemo.Array2Queue;

//数组实现顺序队列
public class Array2Queue {

    private Object[] objects;

    private int head = 0;

    private int tail = 0;

    private int capacity = 0;

    /**
     * 初始化队列
     */
    public Array2Queue(int capacity){
        this.objects = new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * 入队
     */
    public void put(Object object){
        if(isFull()){
            throw new RuntimeException("队满");
        }
        objects[tail] = object;
        tail = (tail+1)%objects.length;
    }

    /**
     * 取出队首元素，但不出队
     */
    public Object peek(){
        if(isEmpty()){
            throw new RuntimeException("队空");
        }
        return objects[head];
    }

    /**
     * 出队
     */
    public Object pop(){
        if(isEmpty()){
            throw new RuntimeException("队空");
        }
        Object object = objects[head];
        head = (head+1)%objects.length;
        return object;
    }

    /**
     * 队列元素数
     */
    public int size(){
        if(tail >= head){
            return tail-head;
        }else{
            return tail+objects.length-head;
        }
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        return head==tail;
    }

    /**
     * 判满
     * 当已有元素个数 + 1 = 容量 就算满
     */
    public boolean isFull(){
        return head == (tail+1)%objects.length;
    }

    /**
     * 得到总容量
     */
    public int getCapacity(){
        return capacity;
    }
}
