package insertSort.objectSort;

public class objectApp {
    public static void main(String[] args) {
        objectArray arr;
        arr = new objectArray(5);

        arr.insert("aFang",20);
        arr.insert("mimi",19);
        arr.insert("lisa",26);
        arr.insert("Fangfang",44);

        System.out.println("---the original data ----");
        arr.display();

        System.out.println("-----the data after insertSort-----");
        arr.insertSort();
        arr.display();

    }
}
