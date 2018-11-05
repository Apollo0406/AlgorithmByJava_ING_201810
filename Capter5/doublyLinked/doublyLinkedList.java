package doublyLinked;

public class doublyLinkedList {
    private Link first;
    private Link last;

    public doublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(long value){
        Link newLink = new Link(value);
        if(isEmpty()){
            last = newLink;
        }
        else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long value) {
        Link newLink = new Link(value);
        if (isEmpty()) {
            first = newLink;
        }
        else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.previous = null;

        first = first.next;
        return temp;
    }

    public Link deleteLast(){
        Link temp = last;
        if(first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key,long data){
        Link current = first;
        while(current.data != key){
            current = current.next;
            if(current == null)
                return false;
        }
        Link newLink = new Link(data);

        if(current == last){
            newLink.next = null;
            last = newLink;
        }
        else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteKey(long key){

    }
}
