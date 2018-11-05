package sortedList;

public class sortedList {
    private Link first;

    public sortedList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(long value){
        Link newLink = new Link(value);
        Link previous = null;
        Link current = first;

        while(current!= null && value > current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null)
            first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
    }

    //remove()每次只移动链表头的数据
    public Link remove(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.print("sortedList(first->tail):");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
