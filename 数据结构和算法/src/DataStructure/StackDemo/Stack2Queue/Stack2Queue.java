package DataStructure.StackDemo.Stack2Queue;


import DataStructure.StackDemo.Array2Stack.Stack;
import com.sun.org.apache.regexp.internal.RE;

//栈实现队列
public class Stack2Queue {

    private Stack stack1;
    private Stack stack2;
    private int maxSize;

    public Stack2Queue(int maxSize){
        this.maxSize = maxSize;
        stack1 = new Stack(maxSize);
        stack2 = new Stack(maxSize);
    }

    /**
     * 入队：直接把元素放入s1中
     */
    public void push(int value){
        if(isFull()){
            throw new RuntimeException("队满！");
        }
        stack1.push(value);
    }

    /**
     * 出队：若s2不为空，则pop s2 的，若 s2 为空，则将 s1 的元素倒入 s2 中，再弹出 s2 的。
     */
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("队空！");
        }
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    /**
     * 已存个数
     */
    public int size(){
        return stack1.size() + stack2.size();
    }
    /**
     * 容量
     */
    public int getMaxSize(){
        return maxSize;
    }

    /**
     * 判满
     * 当s1 和 s2 中的元素总和等于最大容量则为满
     * @return
     */
    public boolean isFull(){
        return stack1.size()+stack2.size() == maxSize;
    }

    /**
     * 判空
     * 当 s1 和 s2 都为空时，整个判为空
     */
    public boolean isEmpty(){
        return stack1.size() == 0 && stack2.size() == 0;
    }
}
