package anagramsDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class anagramApp {
    static char[] arrChar = new char[100];
    static int size;
    static int count;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        size = input.length();
        count = 0;

        for(int i =0 ;i<size ;i++){
            arrChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

    public static void doAnagram(int newSize){
        if(newSize == 1)
            return;
        else{
            for(int j = 0; j<newSize ; j++){
                doAnagram(newSize-1);
                if(newSize == 2)
                    displayWord();
                rotate(newSize);
            }
        }
    }

    public static void rotate(int newSize){
        int j;
        int position = size - newSize;
        char temp = arrChar[position];

        for(j=position+1 ; j < size; j++ ){
            arrChar[j-1] = arrChar[j];
        }
        arrChar[j-1] = temp;
    }

    public static void displayWord(){
        if(count< 99)
            System.out.print(" ");
        if(count < 9)
            System.out.print(" ");
        System.out.print(++count+" ");

        for(int j =0 ; j<size ; j++){
            System.out.print(arrChar[j]);
        }
        System.out.print(" ");
        System.out.flush();

        if(count%6 == 0)
            System.out.println(" ");
    }

    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
