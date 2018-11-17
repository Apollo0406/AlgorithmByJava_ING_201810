package mergeApp;

public class mergeApp {
    public static void main(String[] args) {
        int[] arrA = {23,47,62,95};
        int[] arrB = {7,14,39,55,62,74};
        int[] arrC = new int[10];

        merge(arrA,4,arrB,6,arrC);
        display(arrC,10);
    }

    private static void display(int[] arr, int i) {
        System.out.println("the array after mergeSort:");
        for(int j = 0 ; j < i;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
    }

    public static void merge(int[] arrA,int sizeA,int[] arrB,int sizeB,int[] arrC){
        int aDex = 0;
        int bDex = 0;
        int cDex = 0;

        while(aDex<sizeA && bDex<sizeB){
            if(arrA[aDex]<arrB[bDex])
                arrC[cDex++] = arrA[aDex++];
            else
                arrC[cDex++] = arrB[bDex++];
        }
        while(aDex < sizeA) {  //当B数组先为空，直接将A剩下的数据复制到C中
            arrC[cDex++] = arrA[aDex++];
        }
        while(bDex < sizeB){  //当A为空，挪b的值
            arrC[cDex++] = arrB[bDex++];
        }
    }
}
