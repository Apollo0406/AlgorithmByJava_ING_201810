package selectSort;

import java.awt.desktop.SystemSleepEvent;

public class selectSortApp {
    public static void main(String[] args) {
        int max = 100;
        int size =10;
        arraySelect arr;
        arr = new arraySelect(max);

        /*arr.insert((long)(Math.random()*100+1));
        arr.insert((long)(Math.random()*100+1));
        arr.insert((long)(Math.random()*100+1));
        arr.insert((long)(Math.random()*100+1));
        arr.insert((long)(Math.random()*100+1));
        arr.insert((long)(Math.random()*100+1));*/

        //利用循环随机生成数据存入数组
        for(int i=0;i<size;i++){
            long n = (long)(Math.random()*100+1);
            arr.insert(n);
        }

        System.out.println("-------the original data------");
        arr.display();

        System.out.println("--------the data after selectSort-------");
        arr.selectSort();
        arr.display();
    }
}
