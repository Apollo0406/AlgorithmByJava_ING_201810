package classDataArray;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxsize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxsize);

        arr.insert("tom",17,"teacher");
        arr.insert("lily",22,"driver");
        arr.insert("tt",24,"mom");
        arr.insert("hash",14,"sale");
        arr.insert("apollo",56,"it");
        arr.insert("hi",45,"tea");

        System.out.println("----the original data:------");
        arr.display();

        System.out.println("----the search answer:------");
        String searchName = "apollo";
        if(arr.find(searchName)!=null){
            System.out.println("Found:"+searchName);
            arr.find(searchName).display();
        }else{
            System.out.println("Not Found");
        }

        System.out.println("----the delete data:------");
        String deleteName = "tom";
        arr.delete(deleteName);
        arr.display();
    }
}
