package Stack.bracketsMacth;

public class bracketChecker {
    private String input;

    public bracketChecker(String in){
        input = in;
    }

    public void check(){
        int stackSize = input.length();
        backetsStack bs = new backetsStack(stackSize);

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);  //拿到当前字符
            if(c == '{' || c == '(' || c =='[')  //看是不是左分隔符
                bs.push(c); //入栈
            else if (c == '}' || c == ')' || c == ']') {
                if (!bs.isEmpty()) { //当栈不为空，则出栈栈顶来匹配
                        char p = bs.peek();
                        if(
                                p == '{' && c =='}' ||
                                p == '(' && c == ')'||
                                p =='[' && c == ']'){
                            bs.pop();

                        }
                }
            }
        }
        if(bs.isEmpty())
             System.out.println("match!");
        else
            System.out.println("not match!");
    }
}
