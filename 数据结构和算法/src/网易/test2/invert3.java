package 网易.test2;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class invert3 {
    public static void main(String[] args) {
        //1.需要把输入的字符串，进行反转
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        //利用栈来进行反
        Stack<Object> s = new Stack<>();

        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            s.push(st.nextElement());
        }

        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()){
            sb.append(s.pop());
            sb.append(" ");
        }

        System.out.println(sb);
    }
}

