package DataStructure.LinkedListDemo.LinkedList;

public class Link {

    private int size = 0;

    private Node first;

    private Node last;

    /**
     * 链表初始化
     */
    public Link(){
    }

    /**
     * 链表尾插
     */
    public void addLast(int data){
        if(size == 0){
            fillStart(data);
        }else{
            Node node = new Node();
            last.setData(data);
            last.setNext(node);
        }
        size++;
    }

    /**
     * 链表头插
     */
    public void addFirst(int data){
        if(size == 0){
            fillStart(data);
        }else{
            Node node = new Node();
            node.setData(data);
            node.setNext(first);
            first = node;
        }
        size++;
    }

    /**
     * 在空链表中插入第一个元素
     */
    public void fillStart(int data){
        first = new Node();
        first.setData(data);
        last = first;
    }

    /**
     * 在链表指定位置的后一个插入
     */
    public void add(int data,int index){
        if(size > index){
            if(size == 0){
                fillStart(data);
                size++;
            }else if(index == 0){
                addFirst(data);
                size++;
            }else if(size == index+1){
                addLast(data);
                size++;
            }else{
                Node temp = get(index);
                Node node = new Node();
                node.setData(data);
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;
            }
        }else{
            throw new IndexOutOfBoundsException("位置错误！");
        }
    }

    /**
     * 获取元素下标
     */
    public Node get(int index){
        Node temp = first;
        for(int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp;
    }

    /**
     * 删除链表头元素
     */
    public void removeFirst(){

    }

    /**
     * 删除链表尾元素
     */
    public void removeLast(){

    }

    /**
     * 删除链表指定位置后面的元素
     */
    public void remove(int index){

    }

    /**
     * 打印所有链表元素
     */
    public void printAll(){
        Node temp = first;
        System.out.println(temp.getData());
        for(int i = 0; i < size - 1; i++){
            temp = temp.getNext();
            System.out.println(temp.getData());
        }
    }

    /**
     * 获取链表元素个数
     */
    public int size(){
        return size;
    }
}
