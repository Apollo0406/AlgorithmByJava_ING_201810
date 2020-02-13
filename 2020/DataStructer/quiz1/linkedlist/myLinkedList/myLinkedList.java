package linkedlist.myLinkedList;

/**
 * 实现单链表，包括：
 * add:添加一个节点
 * update:修改一个节点
 * delete:删除一个节点
 * show:遍历全链表，打印每个node
 * size:求链表的有效节点的个数
 */
public class myLinkedList {
    linkedNode head;
    //构造器用来初始化一个链表的头节点
    public myLinkedList(){
        head = new linkedNode(-1," ",null);
    }

    /**
     * add:直接在链表尾部添加元素
     */
    public void add(linkedNode node){
        //1.判断链表是否只有头节点head.next == null
        if(head.next == null){
            head.next = node;
            node.next = null; //新入的node成为链表尾
        }
        //2.如果链表有其他节点，则需要临时指针，从head后面开始遍历，直到找到链表尾
        linkedNode temp = head.next;
        while(true){ //temp所指的节点为链表尾节点
            if(temp.next == null){
                temp.next = node;
                node.next = null; //将Node置为尾节点
                break;
            }
            //若temp.next不为null,则temp后移
            temp = temp.next;
        }
    }

    /**
     * show:遍历链表，打印每个节点
     */
    public void show(){
        //判断是否为空链表
        if(head.next == null){
            System.out.println("链表为空，无法show!");
            return;
        }
        linkedNode temp = head;
        while(temp.next != null){
            System.out.print(temp.next.toString());
            temp = temp.next;
        }
    }

    /**
     * deleteByNo:删除某个节点，指定no，去删除
     */
    public void deleteByNo(int no) {
        //判空
        if(head.next == null){
            System.out.println("链表空，无法删除！");
            return;
        }
        //不为空，则循环遍历找对应的no
        linkedNode temp = head;
        boolean flag = false;
        while (true){
            if(temp.next.no == no && temp.next.next == null){ //匹配到了,而且为链表尾节点
                temp.next = null;
                flag = true;
                break;
            }else if(temp.next.no == no && temp.next.next != null){ //匹配到了，不为尾节点
                temp.next = temp.next.next;
                flag = true;
                break;
            }
            //不匹配，就temp后移
            temp = temp.next;
        }
        if(flag){
            System.out.println("成功删除");
            return;
        }
        System.out.println("不存在该node");
    }

    /**
     * update:根据no修改某个节点的值
     */


    /**
     * size:统计链表的有效节点个数
     */
    public int size(){
        if(head.next == null){
            System.out.println("链表空，size=0");
            return 0;
        }
        //不为空，则定义一个计数器，用临时指针遍历
        int count = 0;
        linkedNode temp = head;
        while(true){
            while(temp.next != null) {
                count++;
                temp = temp.next;
            }
            break;
        }
        return count;
    }
}
