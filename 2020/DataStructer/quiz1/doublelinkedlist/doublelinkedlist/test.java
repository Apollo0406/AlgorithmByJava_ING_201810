package doublelinkedlist.doublelinkedlist;

public class test {
    public static void main(String[] args) {
        myDoubleLinkedList doubleLinkedList = new myDoubleLinkedList();
        doubleLinkedList.show();

        //新建Node,加入双向链表
        doubleNode node1 = new doubleNode(1,"yi");
        doubleLinkedList.add(node1);
        doubleNode node2 = new doubleNode(2,"er");
        doubleLinkedList.add(node2);
        //linkedList.show();
        doubleNode node3 = new doubleNode(3,"san");
        doubleLinkedList.add(node3);
        doubleNode node4 = new doubleNode(4,"si");
        doubleLinkedList.add(node4);
        doubleNode node5 = new doubleNode(5,"wu");
        doubleLinkedList.add(node5);
        doubleNode node6 = new doubleNode(6,"liu");
        doubleLinkedList.add(node6);

        doubleLinkedList.show();

        System.out.println("-------------deleteByNo-------");
        doubleLinkedList.deleteByNo(1);
        doubleLinkedList.show();

    }
}
