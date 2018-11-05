package sortedList;
//有序链表的remove很方便用于存取最小值，因为其在链表头
public class sortedListApp {
    public static void main(String[] args) {
        sortedList theSortedList = new sortedList();
        theSortedList.insert(33);
        theSortedList.insert(77);
        theSortedList.insert(11);
        theSortedList.insert(66);
        theSortedList.insert(44);

        theSortedList.displayList();

        theSortedList.insert(1234500);
        theSortedList.remove();
        theSortedList.displayList();
    }
}
