package doublyLinked;
//双向链表
//和循环链表不同
public class Link {
    public long data;
    public Link next;
    public Link previous;

    public Link(long data){
        this.data = data;
    }

    public void displayLink(){
        System.out.print(data+" ");
    }
}
