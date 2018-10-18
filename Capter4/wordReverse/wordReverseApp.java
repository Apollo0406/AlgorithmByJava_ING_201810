package wordReverse;

public class wordReverseApp {
    public static void main(String[] args) {
        wordStack ws = new wordStack(10);

        ws.push('c');
        ws.push('h');
        ws.push('i');
        ws.push('n');
        ws.push('a');

        System.out.println(" --- reverse ---");
        ws.reverse();
    }
}