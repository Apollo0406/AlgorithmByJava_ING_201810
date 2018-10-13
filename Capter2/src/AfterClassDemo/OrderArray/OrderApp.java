package OrderArray;

public class OrderApp {
    public static void main(String[] args) {
        int maxsize = 100;
        OrdArray arr;
        arr = new OrdArray(maxsize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        System.out.println("--------------the original data:---------------");
        arr.display();

        System.out.println("--------------the answer of insert2:---------------");
        arr.insert2(78);
        arr.display();

        System.out.println("--------------the answer of search:---------------");
        int searchKay = 33;
        if(arr.find(searchKay)!=arr.size()){
            System.out.println("Found:"+searchKay);
        }else{
            System.out.println("Not Found:"+searchKay);
        }

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        System.out.println("--------------the data after delete:--------");
        arr.display();

        //-----------随机创建俩个有序数组，并调用merge()将其合并并打印输出-----
        OrdArray a,b;
        a = new OrdArray(5);
        b = new OrdArray(5);
       // a.randomCreate(a);  //随机给数组a赋值，但要保证有序还得进行逻辑判断
        //b.randomCreate(b);
        //arr.merge(a,b);  //进行合并，返回值期待为一个新数组
        //arr.merge(a,b).display();
    }

}
