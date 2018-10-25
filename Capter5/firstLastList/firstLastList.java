package firstLastList;

public class firstLastList {
    private Link first;
    private Link last;

    public firstLastList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        if(isEmpty()){
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int data){
        Link newLink = new Link(data);
        if(isEmpty()){
            first = newLink;
        }
        else{
           last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst(){
        long temp = first.data;
        if(first.next==null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void display(){
        System.out.println("Lst(first->last)");
        Link current = first;
        while(current!=null){
            current.display();
            current = current.next;
        }
        System.out.println(" ");
    }
}
