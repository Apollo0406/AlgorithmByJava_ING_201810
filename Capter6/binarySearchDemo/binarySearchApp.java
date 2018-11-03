package binarySearchDemo;

public class binarySearchApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ordArray arr;
        arr = new ordArray(maxSize);

        arr.insert(72);
        arr.insert(55);
        arr.insert(22);
        arr.insert(66);
        arr.display();

        int searchKey = 22;
        if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can not find "+ searchKey);
    }
}
