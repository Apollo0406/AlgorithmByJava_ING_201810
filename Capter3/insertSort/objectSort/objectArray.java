package insertSort.objectSort;

public class objectArray {
    private Student[] stu;
    private int nElem;

    public objectArray(int max){
        stu = new Student[max];
        nElem = 0;
    }

    public void insert(String name ,int age){
        stu[nElem] = new Student(name,age);
        nElem++;
    }

    public void display(){
        for(int i = 0 ; i < nElem ;i++){
            stu[i].displayStudent();
        }
    }

    public void insertSort(){
        int in,out;
        Student temp;

        for(out = 1; out < nElem ; out++){
                in = out ;
                temp = stu[in];
                while(in > 0 && stu[in-1].getName().compareTo(temp.getName())>0){
                        stu[in] = stu[in-1];
                        in--;
                }
                stu[in] = temp;
        }
    }
}
