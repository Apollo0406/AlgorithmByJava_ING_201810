package Queue.basicQueue;

public class queueApp {
    public static void main(String[] args) {
        queue q = new queue(10);
        q.push(3);
        q.push(45);
        q.push(22);
        q.push(66);
        q.push(90);
        q.push(91);
        q.push(92);
        q.push(93);
        q.push(94);
        q.push(95);


        System.out.println("--- print the queue: ---");
        q.print();

        System.out.println("-- the top : ---");
        System.out.println(q.peek());

        System.out.println("-- remove  ---");
        System.out.println(q.pop());
        q.print();
        q.push(95);
        q.push(96);
        q.push(97);
        q.print();
    }
}
