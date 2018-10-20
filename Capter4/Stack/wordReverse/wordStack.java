package wordReverse;


public class wordStack {
    private char[] s;
    private int maxSize;
    private int top;

    public wordStack(int size){
        maxSize = size;
        s = new char[maxSize];
        top = -1;
    }

    public void push(char value){
        s[++top] = value;
    }

    public char pop(){
        return s[top--];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void reverse() {
        while (!isEmpty()) {
            System.out.print(pop());
        }
    }
}

