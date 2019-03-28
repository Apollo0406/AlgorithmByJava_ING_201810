package Algorithm.DailyDemo;

public class Demo1Sort {
    public static void main(String[] args) {
        int[] arr1 = {2,5,8,1,4,10};
        System.out.println("排序前：");
        Print(arr1);
        System.out.println("冒泡排序后的结果：");
        BubbleSort(arr1);
        Print(arr1);

        System.out.println("-------------------------------");
        int[] arr2 = {12,333,4,23,3,1,8,5,24,55};
        System.out.println("排序前：");
        Print(arr2);
        System.out.println("快速排序后的结果：");
        QuickSort(arr2,0, arr2.length-1);
        Print(arr2);

        System.out.println("-------------------------------");
        int[] arr3 = {12,3,8,5,24,55};
        System.out.println("排序前：");
        Print(arr3);
        System.out.println("插入排序后的结果：");
        InsertSort(arr3);
        Print(arr3);

        System.out.println("-------------------------------");
        int[] arr4 = {12,333,4,23,3,1,8,5,24,55};
        System.out.println("排序前：");
        Print(arr4);
        System.out.println("选择排序后的结果：");
        SelectSort(arr4);
        Print(arr4);
    }

    private static void SelectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    private static void InsertSort(int[] arr) {
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] < arr[i-1]){
                int temp = arr[i];
                int j;
                for(j = i-1 ; j >= 0 && arr[j] > temp; j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }


    private static void QuickSort(int[] arr,int start,int end) {
        if(start < end){
            int key = arr[start];
            int low = start;
            int high = end;
            while(low < high){
                if(low < high && arr[high] > key){
                    high--;
                }
                arr[low] =arr[high];
                if(low < high && arr[low] < key){
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = key;
            QuickSort(arr,0,low);
            QuickSort(arr,low+1,end);
        }
    }

    private static void BubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void Print(int[] arr) {
        for(int m = 0; m < arr.length; m++){
            System.out.print(arr[m] + " ");
        }
        System.out.println();
    }
}
