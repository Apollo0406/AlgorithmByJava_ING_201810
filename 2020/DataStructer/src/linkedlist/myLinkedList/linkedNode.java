package linkedlist.myLinkedList;

/**
 * 链表中的节点
 */
public class linkedNode {
    int no;
    String name;
    linkedNode next;

    //构造器用来创建节点
    public linkedNode(int no,String name,linkedNode next){
        this.no = no;
        this.name = name;
        this.next = next;
    }

    //重写toString()
    public String toString(){
        return "[no:"+no+",name:"+name+"]\n";
    }
}
