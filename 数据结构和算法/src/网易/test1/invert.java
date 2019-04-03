package 网易.test1;

import java.util.Scanner;

public class invert {
        public static void main(String[] args) {
            //1.需要把输入的字符串，进行反转
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            //System.out.println(str);
            String arr[] = str.split(" ");

            for(int i = arr.length-1; i >= 0 ; i--){
                if(arr[i].contains(",")){
                    String inner[] = arr[i].split(",");
                    for(int j = inner.length-1; j > 0; j--){
                        System.out.print(inner[j]+","+inner[j-1]);
                    }
                }
              /* if(arr[i].contains(".")){
                    String inner2[] = arr[i].split(".");
                    for(int j = inner2.length-1; j > 0; j--){
                        System.out.print(inner2[j]+"."+inner2[j-1]);
                    }
                }*/else
                    System.out.print(arr[i]+" ");
            }
        }
    }

