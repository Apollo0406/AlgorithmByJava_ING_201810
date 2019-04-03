package Algorithm.DailyDemo;

public class Demo2Reverse {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("------------原始数组如下：---------");
        Print(arr);
        System.out.println("------------行列反转之后数组如下：---------");
        Reverse(arr);
        Print(arr);
        System.out.println("------------行列左右反转之后数组如下：---------");
        AllReverse(arr);
        Print(arr);
    }

    private static void Reverse(int[][] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr[i].length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    private static void AllReverse(int[][] arr) {
        //如果行数为奇数，就中间行保持不变，其余行对称交换
        if(arr.length % 2 == 0){
            OReverse(arr);
        }
        //如果行数为偶数，就都镜像交换
        JReverse(arr);
    }

    private static void JReverse(int[][] arr) {
        for(int i = 0; i < arr.length/2; i++){
            for(int j = 0; j < arr[i].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length/2+arr.length/2-i][j];
                arr[arr.length/2+arr.length/2-i][j] = temp;
            }
        }
    }

    private static void OReverse(int[][] arr) {
        for(int i = 0; i < arr.length/2; i++){
            for(int j = 0; j < arr[i].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length/2+arr.length/2-i-1][j];
                arr[arr.length/2+arr.length/2-i-1][j] = temp;
            }
        }
    }

    private static void Print(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
