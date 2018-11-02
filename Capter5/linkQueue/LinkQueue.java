package linkQueue;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue(){
        theList = new FirstLastList();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void insert(long j){
        theList.insertLast(j);
    }

    public long remove(){
        return theList.deleteFirst();
    }

    public void display(){
        System.out.print("Queue(first->rear):");
        theList.display();
    }
}
