package Stack.bracketsMacth;

public class backetsStack {
    private char[] s;
    private int top;
    private int maxSize;

    public backetsStack(int size){
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

    public char peek(){
        return s[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
