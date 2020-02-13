package linkedlist.myLinkedList;

public class test {
    public static void main(String[] args) {
        myLinkedList linkedList = new myLinkedList();
        System.out.println("------show一下空链表---------");
        linkedList.show();
        System.out.println("-------size--------");
        System.out.println(linkedList.size());
        System.out.println("------添加node1---------");
        //新建一个node
        linkedNode node1 = new linkedNode(1,"张三",null);
        linkedList.add(node1);
        System.out.println("------添加node1后，show---------");
        linkedList.show();
        System.out.println("-------size--------");
        System.out.println(linkedList.size());

        /*System.out.println("--------删除node1------");
        linkedList.deleteByNo(1);
        linkedList.show();*/

       //新建一个node
        linkedNode node2 = new linkedNode(2,"李四",null);
        linkedNode node3 = new linkedNode(3,"王五",null);
        linkedList.add(node2);
        System.out.println("------添加node2后，show---------");
        linkedList.show();
        linkedList.add(node3);
        System.out.println("------添加node3后，show---------");
        linkedList.show();
        System.out.println("-------size--------");
        System.out.println(linkedList.size());
        linkedNode node4 = new linkedNode(4,"赵六",null);
        linkedList.add(node4);
        System.out.println("-------size--------");
        System.out.println(linkedList.size());
        System.out.println("------添加node4后，show---------");
        linkedList.show();


        System.out.println("--------删除node2------");
        linkedList.deleteByNo(2);
        linkedList.show();
        /*System.out.println("--------删除node4------");
        linkedList.deleteByNo(4);
        linkedList.show();*/

    }
}
