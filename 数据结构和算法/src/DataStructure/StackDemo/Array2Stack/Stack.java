package DataStructure.StackDemo.Array2Stack;

import java.util.Arrays;

public class Stack {

    private int size = 0;

    private int[] array;

    public Stack(){
        array = new int[10];
    }

    public Stack(int size){
        if(size <= 0){
            size = 10;
        }
        array = new int[size];
    }

    /**
     * 判空
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 判满
     */
    public boolean isFull(){
        return size == array.length;
    }

    /**
     * 入栈
     */
    public void push(int value){
        if(size == array.length){
            array = Arrays.copyOf(array,array.length*2);
        }
        array[size++] = value;
    }

    /**
     * 出栈
     */
    public int pop(){
        int value = array[size-1];
        size--;
        return value;
    }

    /**
     * 取栈顶
     */
    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("栈空");
        }
        return array[size-1];
    }

    /**
     * 大小
     */
    public int size(){
        return size;
    }
}
