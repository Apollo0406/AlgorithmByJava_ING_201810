package listInsertSort;

public class sortedList {
    private Link first;

    public sortedList(){
        first = null;
    }

    public sortedList(Link[] linkArr){
        first = null;
        for(int j = 0 ; j < linkArr.length; j++){
            insert(linkArr[j]);
        }
    }

    public void insert(Link k){
        Link previous = null;
        Link current = first;

        while(current != null && k.data > current.data){
            previous = current;
            current = current.next;
        }
        if(previous==null)
            first = k;
        else
            previous.next = k;

        k.next = current;
    }

    //remove仅仅是剔除链表头
    public Link remove(){
        Link temp = first;
        first = first.next;
        return temp;
    }
}
