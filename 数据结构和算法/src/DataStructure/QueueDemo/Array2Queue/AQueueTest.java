package DataStructure.QueueDemo.Array2Queue;

/**
 * 队列可存放元素个数 = 总容量 - 1
 *
 */
public class AQueueTest {
    public static void main(String[] args) {
        Array2Queue queue = new Array2Queue(5);
        System.out.println("queue.isEmpty():"+queue.isEmpty());
        System.out.println("queue.isFull():"+queue.isFull());
        System.out.println("queue.size():"+queue.size());
        System.out.println("queue.getCapacity():"+queue.getCapacity());
        System.out.println("----------------------");
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        //queue.put(5);
        /*queue.put(6);*/
        System.out.println("queue.isEmpty():"+queue.isEmpty());
        System.out.println("queue.isFull():"+queue.isFull());
        System.out.println("queue.size():"+queue.size());
        System.out.println("queue.getCapacity():"+queue.getCapacity());
        System.out.println("----------------------");
        System.out.println("queue.pop():"+queue.pop());
        System.out.println("queue.pop():"+queue.pop());
        System.out.println("queue.isEmpty():"+queue.isEmpty());
        System.out.println("queue.isFull():"+queue.isFull());
        System.out.println("queue.size():"+queue.size());
        System.out.println("queue.getCapacity():"+queue.getCapacity());
        System.out.println("----------------------");


    }
}
