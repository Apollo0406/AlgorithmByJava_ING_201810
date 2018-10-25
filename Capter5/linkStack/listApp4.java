package linkStack;

public class listApp4 {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();

        theStack.push(11);
        theStack.push(22);
        theStack.push(33);
        theStack.push(44);
        theStack.push(55);

        System.out.println("----the original data: ----");
        theStack.display();

        System.out.println("--pop ---");
        theStack.pop();
        theStack.display();
    }
}
