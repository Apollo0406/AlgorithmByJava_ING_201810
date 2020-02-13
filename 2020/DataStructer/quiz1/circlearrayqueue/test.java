package circlearrayqueue;

/**
 * bug:队列中只有一个元素时，出队后不用变front的值,但是要把rear改变
 * 初始：f = 0; r = 0
 * 入队:f = 0; r = 1
 * 出队：f = 1;r =
 *
 */
public class test {
    public static void main(String[] args) {
        circleArrayQueue myCircleQueue = new circleArrayQueue(4);
        System.out.println("判空结果：");
        System.out.println(myCircleQueue.isEmpty());
        System.out.println("判满结果：");
        System.out.println(myCircleQueue.isFull());
        System.out.println("--------------front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("添加元素1");
        myCircleQueue.add(1);
        System.out.println("---------------front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("有效元素个数：");
        System.out.println(myCircleQueue.size());
        System.out.println("出队元素");
        System.out.println(myCircleQueue.out());
        System.out.println("--------------front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("有效元素个数：");
        System.out.println(myCircleQueue.size());
        System.out.println("---------------添加三个元素--------------");
        System.out.println("添加元素1");
        myCircleQueue.add(1);
        System.out.println("添加元素2");
        myCircleQueue.add(2);
        System.out.println("添加元素3");
        myCircleQueue.add(3);
        System.out.println("front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("有效元素个数：");
        System.out.println(myCircleQueue.size());
        System.out.println("---------------添加三个元素后再加一个--------------");
        System.out.println("添加元素4");
        myCircleQueue.add(4);
        System.out.println("front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("有效元素个数：");
        System.out.println(myCircleQueue.size());
        System.out.println("---------------show()--------------");
        myCircleQueue.show();
        System.out.println("front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
       System.out.println("---------------1、2、3满了，出一个再入4--------------");
        System.out.println("出队元素");
        System.out.println(myCircleQueue.out());
        System.out.println("front="+myCircleQueue.front+"rear="+myCircleQueue.rear);
        System.out.println("添加元素4");
        myCircleQueue.add(4);
        System.out.println("front="+myCircleQueue.front+"rear="+myCircleQueue.rear);


        //System.out.println("show初始队列：");
    }
}
