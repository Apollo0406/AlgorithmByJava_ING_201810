package doublelinkedlist.doublelinkedlist;

/**
 * 双向链表的一个节点
 */
public class doubleNode {
    int no;
    String name;
    doubleNode next;
    doubleNode pre;

    public doubleNode(int no,String name){
        this.no = no;
        this.name = name;
    }

    public String toString(){
        return "[no:"+no+",name:"+name+"]";
    }
}
