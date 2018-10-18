package insertSort.objectSort;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void displayStudent(){
        System.out.println("name:"+name+" age:"+age);
    }
}
