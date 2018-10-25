package LinkList2;

public class LinkApp2 {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(22);
        theList.insertFirst(45);
        theList.insertFirst(3);
        theList.insertFirst(26);

        /*System.out.println("----the original data -----");
        theList.display();

        System.out.println(" -----after dalete 45 ---");
        theList.delete(45);
        theList.display();*/

        System.out.println(theList.returnData());
        Link find = theList.find(3);
        System.out.println(find.data);
        System.out.println(find.next);
    }
}
