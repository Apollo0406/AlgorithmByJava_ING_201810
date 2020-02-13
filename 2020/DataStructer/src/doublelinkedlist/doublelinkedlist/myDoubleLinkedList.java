package doublelinkedlist.doublelinkedlist;

public class myDoubleLinkedList {
    doubleNode head;

    public myDoubleLinkedList(){
        head = new doubleNode(-1," ");
    }

    /**
     * add:向双向链表的表尾添加一个节点
     */
    public void add(doubleNode node){
       doubleNode temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       //退出while就说明，temp.next = null,即temp指向了表尾
        temp.next = node;
        node.pre = temp;
    }

    /**
     * delete:找到某个待删节点
     * temp.next.pre = temp.pre;
     * temp.pre.next = temp.next;
     */
    public void deleteByNo(int no){
        if(head.next == null){
            System.out.println("双向链表为空，无法删除！");
        }
        //不为空,遍历查找no是否存在，不存在报错
        boolean flag = false;
        doubleNode temp = head.next;
        while (temp != null){
            if(temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){ //匹配到了no
            //删除temp所指的节点
            if(temp.next != null) {  //如果temp不为链表尾
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
                return;
            }
            //temp为链表尾
            temp.pre.next = null;
            return;
        }
        System.out.println("参数no没有匹配到节点，请确认no是否正确！");
    }

    /**
     * show:从头遍历双向链表
     */
    public void show(){
        if(head.next == null){
            System.out.println("双向链表为空，无法show!");
            return;
        }
        //不为空，则继续用next遍历
        doubleNode temp = head.next;
        while (temp != null){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

}
