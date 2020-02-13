package linkedlist.findlastknode;
/**
 * 寻找单链表倒数第K个节点
 */

public class myLinkedList {

    linkedNode head;

    //构造器
    public myLinkedList(){
        head = new linkedNode(-1," ",null);
    }

    /**
     * add
     */
    public void add(linkedNode node){
        if(isEmpty()){
            head.next = node;
            node.next = null;

            return;
        }
        //不为空
        linkedNode temp = head;
        while (true){
            if (temp.next == null){
                temp.next = node;
                node.next = null;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * findLastKNode
     */
    public linkedNode findLastKNode(int k){
        //1.先做基本的数据校验
        if(k <= 0 || k > size()){
            throw new RuntimeException("参数有误，请重新给参数！");
        }

        //要找倒数第k个，也就是从第一个有效节点往后要遍历（size - k）次
        int num = size() - k + 1;
        //从第一个有效节点往后遍历num次，temp所指的就是所求
        linkedNode temp = head;
        while (temp.next != null && num != 0){
            temp = temp.next;
            num--;
        }
        return temp;
    }

    /**
     * size
     */
    public int size(){
        if(isEmpty()){
            return 0;
        }
        int count = 0;
        linkedNode temp = head.next;

        while (temp != null){
                count++;
                temp = temp.next;
        }

        return  count;
    }
    /**
     * show
     */
    public void show(){
        if(isEmpty()){
            System.out.println("链表为空，无法show!");
            return;
        }
        linkedNode temp = head;
        while (temp.next != null){
                System.out.println(temp.next.toString());
                temp = temp.next;
        }

    }

    /**
     * isEmpty
     */
    public boolean isEmpty(){
        return head.next == null;
    }
}
