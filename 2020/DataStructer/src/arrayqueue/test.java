package arrayqueue;

public class test {
    public static void main(String[] args) {
        //新建一个数组队列，长度为4
        arrayQueue myArr = new arrayQueue(4);
        System.out.println("判空结果：");
        System.out.println(myArr.isEmpty());
        System.out.println("判满结果：");
        System.out.println(myArr.isFull());
        System.out.println("添加元素a：");
        myArr.add("a");
        System.out.println("show初始队列：");
        myArr.show();
        try{
            myArr.out();
        }catch (Exception e){
            e.getMessage();
        }
        /*

      //  System.out.println("有效数据个数：");
       // System.out.println(myArr.size());

        System.out.println("------------------------------");
        System.out.println("添加元素b、c：");
        try{
            myArr.add("b");
            myArr.add("c");
            myArr.add("d");
           // myArr.add('e');
        }catch (Exception e){
            e.getMessage();
        }
        System.out.println("判空结果：");
        System.out.println(myArr.isEmpty());
       // System.out.println("有效数据个数：");
        //System.out.println(myArr.size());
        System.out.println("show----------------------");
        myArr.show();*/
    }
}
