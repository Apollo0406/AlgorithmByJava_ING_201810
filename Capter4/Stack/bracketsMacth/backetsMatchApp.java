package Stack.bracketsMacth;
//分隔符匹配问题
public class backetsMatchApp {
    public static void main(String[] args) {
        String str = "a{b(c[])}";
        bracketChecker cheker = new bracketChecker(str);
        cheker.check();
    }
}
