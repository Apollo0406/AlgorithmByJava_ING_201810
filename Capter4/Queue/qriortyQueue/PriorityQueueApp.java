package Queue.qriortyQueue;

public class PriorityQueueApp {
    public static void main(String[] args) {
        PriorityQ pq = new PriorityQ(10);

        pq.insert(30);
        pq.insert(88);
        pq.insert(77);
        pq.insert(44);
        pq.insert(33);
        pq.insert(66);

       while (!pq.isEmpty()){
           long l = pq.remove();
           System.out.print(l+" ");
       }
        System.out.println(" ");
    }
}
