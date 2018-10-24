package LinkedList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(88);
        theList.insertFirst(66);

        theList.displayList();

        while (!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted:");
            aLink.display();
            System.out.println(" ");
        }

        theList.displayList();
    }
}
