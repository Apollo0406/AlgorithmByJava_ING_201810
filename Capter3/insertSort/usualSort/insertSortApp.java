package insertSort.usualSort;

import insertSort.usualSort.insertArray;

public class insertSortApp {
    public static void main(String[] args) {
        insertArray arr;
        arr = new insertArray(10);

        arr.insert(2);
        arr.insert(5);
        arr.insert(7);
        arr.insert(4);
        arr.insert(33);
        arr.insert(6);
        arr.insert(98);

        System.out.println("-------the original data:----");
        arr.display();

        System.out.println("---the data after insertSort-----------");
        arr.insertSort();
        arr.display();
    }
}
