package firstLastList;

public class ListApp3 {
    public static void main(String[] args) {
        firstLastList theList = new firstLastList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.display();

        System.out.println(" -- after delete --- ");
        theList.deleteFirst();
        theList.deleteFirst();
        theList.display();
    }
}
