package 网易.demo2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] data = new int[num];
            for(int i = 0; i < num; i++){
                 data[i] = sc.nextInt();
            }

            //创建列表方便计算总数
            ArrayList<Integer> a = new ArrayList<>();

            int count = 0;
            //对数组数据进行排序，判断里面有没有1
            Arrays.sort(data);
            //如果有1
            if(data[0] == 1){
                for(int i = 1; i < num; i++){
                    for(int j = i+1; j < num ; j++){
                        if(data[j] % data[i] != 0){
                            count++;
                        }
                    }
                }
            }
            //遍历数组，把每个值都先纳入答案，剔除后面能整除它的值（1除外）
            for(int i = 0; i < num; i++){
                    //a.add(data[i]);
                    for(int j = i+1; j < num; j++){
                        if(data[j] % data[i] != 0){
                            //a.add(data[j]);
                            for(int m = j+1; m < num; m++){
                                if(data[m] % data[i] != 0 && data[m] % data[j] != 0 ){
                                  /*  a.add(data[m]);
                                    a.add(data[i]);
                                    a.add(data[j]);*/
                                  count++;
                                }
                            }
                        }
                    }
               }


            System.out.print("共有："+count+"种");
        }
    //求两个数的公约数
    public static int gongyue(int a,int b){
        if(a <= b){
            if(b % a == 0){
                return a;
            }
        }
        return 1;
    }

    //求三个数的公约数
    public static int gongyue(int a,int b,int c){
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        if(arr[2] % arr[0] != 0 && arr[2] % arr[1] != 0 && arr[1] % arr[0] != 0 ){
            return 1;
        }
        return 0;
    }
}

