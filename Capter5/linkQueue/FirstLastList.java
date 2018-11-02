package linkQueue;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertLast(long d){
        Link newLink = new Link(d);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst(){
        long temp = first.data;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
        System.out.println(" ");
    }
}
