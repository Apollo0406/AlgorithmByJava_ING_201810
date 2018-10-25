package linkStack;

public class LinkStack {
    private LinkList theList;

    public LinkStack(){
        theList = new LinkList();
    }

    public void push(int data){
        theList.insertFirst(data);
    }

    public int pop(){
        return theList.delateFirst();
    }

    public boolean isEmpty(){
        return (theList.isEmpty());
    }

    public void display(){
        System.out.println("Stack(top->bottom):");
        theList.display();
    }
}
