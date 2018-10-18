package StackDemo;

public class StackApp {
    public static void main(String[] args) {
        int maxSize;
        maxSize = 10;
        StackX s = new StackX(maxSize);

        s.push(23);
        s.push(3);
        s.push(33);
        s.push(44);
        s.push(56);

        System.out.println("---- the original data ----");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println("--- isEmpty ----");
        boolean b = s.isEmpty();
        System.out.println("isEmpty:"+b);
        System.out.println("---pop  -------");
        long l = s.pop();
        System.out.println("pop :"+ l);
        System.out.println("---- isFull ----");
        boolean b2 =s.isFull();
        System.out.println("isFull:"+b2);
        System.out.println("---- peek ----");
        long p = s.peek();
        System.out.println("peek:"+p);


    }
}
