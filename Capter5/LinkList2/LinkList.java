package LinkList2;

public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public void insertFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key){
        if(first!=null){
            Link current = first;
            while(current.next!=null){
                if(current.data == key){
                    break;
                }
                else
                    current = current.next;
            }
            return current;
        }
        return null;
    }

    public Link delete(int key){
        Link current = first;
        while(current.next!=null){
            if(current.next.data == key){
                current.next = current.next.next;
                return current.next;
            }
            else
                current = current.next;
        }
        return null;
    }

    public void display(){
        System.out.print("List(first->last):");
        Link current = first;
        while(current!=null){
            current.display();
            current = current.next;
           // System.out.print(current.data + " ");
        }
        System.out.println(" ");
    }

    public int returnData(){
        Link current = first.next;
        return current.data;
    }
}
