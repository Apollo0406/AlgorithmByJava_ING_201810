package linkedlist.findlastknode;

public class test {
    public static void main(String[] args) {
        myLinkedList linkedList = new myLinkedList();
        linkedList.show();

        linkedNode node1 = new linkedNode(1,"yi");
        linkedList.add(node1);
        //linkedList.show();

        linkedNode node2 = new linkedNode(2,"er");
        linkedList.add(node2);
        //linkedList.show();
        linkedNode node3 = new linkedNode(3,"san");
        linkedList.add(node3);
        linkedNode node4 = new linkedNode(4,"si");
        linkedList.add(node4);
        linkedNode node5 = new linkedNode(5,"wu");
        linkedList.add(node5);
        linkedNode node6 = new linkedNode(6,"liu");
        linkedList.add(node6);

        linkedList.show();
        System.out.println("size:"+linkedList.size());

        System.out.println("倒数第k个节点为："+linkedList.findLastKNode(1).toString());
    }
}
