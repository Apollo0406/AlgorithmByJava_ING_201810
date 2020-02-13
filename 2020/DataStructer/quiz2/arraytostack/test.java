package quiz2.arraytostack;

public class test {
    public static void main(String[] args) {
        myStack myStack = new myStack(5);
        myStack.show();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        myStack.show();

        System.out.print("pop()的结果："+myStack.pop());
        System.out.print("pop()的结果："+myStack.pop());
        System.out.print("pop()的结果："+myStack.pop());
        System.out.print("pop()的结果："+myStack.pop());
        //System.out.print("pop()的结果："+myStack.pop());
    }
}
