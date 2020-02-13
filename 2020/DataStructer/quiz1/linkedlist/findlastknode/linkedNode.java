package linkedlist.findlastknode;

/**
 * 链表中的节点
 */
public class linkedNode {
    int no;
    String name;
    linkedNode next;

    //构造器用来创建节点
    public linkedNode(int no, String name, linkedNode next){
        this.no = no;
        this.name = name;
        this.next = next;
    }

    public linkedNode(int no, String name){
        this.no = no;
        this.name = name;
    }

    //重写toString()
    public String toString(){
        return "[no:"+no+",name:"+name+"]\n";
    }
}
