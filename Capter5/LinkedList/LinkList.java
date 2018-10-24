package LinkedList;

public class LinkList {
    private Link first;

    public void LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List(first->last):{");
        Link current = first;
        while(current!=null){
            current.display();
            current = current.next;
        }
        System.out.println("}");
    }
}
