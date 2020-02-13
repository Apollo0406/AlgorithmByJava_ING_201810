package quiz2.arraytostack;

/**
 * 数组模拟栈
 */
public class myStack {
    int data;
    int[] array;
    int top; //栈顶

    public myStack(int size){
        array = new int[size];
        top = -1; //栈顶初始位置置为-1
    }

    /**
     * isFull
     */
    public boolean isFull(){
        return top == array.length-1;
    }

    /**
     * ifEmpty
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * add:1.移动top；2.赋值
     */
    public void add(int data){
        //判满
        if(isFull()){
            System.out.println("栈满，无法add!");
            return;
        }
        top++;
        array[top] = data;
    }

    /**
     * show:按照出栈顺序，遍历栈
     */
    public void show(){
        //判空
        if(isEmpty()){
            System.out.println("栈空，无法show!");
            return;
        }
        int index = top;
        while(index != -1){
            System.out.print(array[index]+" ");
            index--;
        }
        System.out.println();
    }

    /**
     * pop:出栈
     */
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("栈空，无法出栈！");
        }
        int value = array[top];
        top--;
        return value;
    }
}
