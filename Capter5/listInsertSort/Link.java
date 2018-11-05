package listInsertSort;
//表插入排序：先创建一个无序数组，把数组元素怒插入到有序列表，
//再把有序列表的数删除，放回原数组
public class Link {
    public long data;
    public Link next;

    public Link(long data){
        this.data = data;
    }

    public void display(){
        System.out.print(data+" ");
    }
}

