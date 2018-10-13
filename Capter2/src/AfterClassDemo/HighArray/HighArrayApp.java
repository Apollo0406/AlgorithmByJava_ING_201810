package HighArray;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insert(33);

        arr.display();

        System.out.println("-------noDup:-----");
        arr.nodup();
        arr.display();

        int searchKey = 26;
        if(arr.find(searchKey)){
            System.out.println("Founded it!");
        }else{
            System.out.println("Can not find it!");
        }

        arr.delete(23);
        arr.delete(88);

        arr.display();
    }
}
