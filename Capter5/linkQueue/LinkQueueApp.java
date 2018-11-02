package linkQueue;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();

        theQueue.insert(23);
        theQueue.insert(40);

        theQueue.display();

        theQueue.insert(55);
        theQueue.insert(77);

        theQueue.display();

        theQueue.remove();
        theQueue.remove();

        theQueue.display();
    }
}
