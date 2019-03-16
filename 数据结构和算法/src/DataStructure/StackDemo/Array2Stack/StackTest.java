package DataStructure.StackDemo.Array2Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size:"+stack.size());
        System.out.println("stack.peek():"+stack.peek());
        System.out.println("stack.size():"+stack.size());
        System.out.println("stack.pop():"+stack.pop());
        System.out.println("stack.pop():"+stack.pop());
        System.out.println("stack.size():"+stack.size());
    }
}
