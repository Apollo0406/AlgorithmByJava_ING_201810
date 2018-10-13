package bubbleSort;

public class bubbleApp {
    public static void main(String[] args) {
        arrayBubble arr;
        int max = 100;
        arr = new arrayBubble(max);

      /*  arr.insert(23);
        arr.insert(78);
        arr.insert(12);
        arr.insert(45);
        arr.insert(33);
        arr.insert(66);*/
        //顺便完成了给数组随机赋值并保证其有序
        //做法：先随机赋值，再让数组调用冒泡排序
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));
        arr.insert((long) (Math.random()*100+1));



        System.out.println("----original data: -------");
        arr.display();

        System.out.println("-----after bubbleSort ------");
        arr.bubbleSort();
        arr.display();
        arr.bubbleSort2();
        arr.display();
    }

}
