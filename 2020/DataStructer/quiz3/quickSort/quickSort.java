package quiz3.quickSort;

/**
 * 基础的快速排序
 */
public class quickSort {
    public static void main(String[] args) {
        int[] array1 = {1,2,2,3,7,-1,9,-4};
        show(array1);
        quickSort(array1,0,array1.length-1);
        show(array1);
    }

    /**
     * 快排
     */
    public static void quickSort(int[] array,int start,int end){
        //数组为空，或只有一个元素则不处理
        if(array.length <= 1){
            return;
        }

        //1.把原数组的首元素当作枢轴
        int boss = array[start];
        //2.定以俩个指针，指向数组首元和末元
        int low = start;
        int high = end;
        //3.low和high都会移动，直到low=high
        while(high > low){
            //4.从后开始比较
            while (array[high] > boss && high > low){
                high--;
            }
            //如果high所指的值小于boss，则将high指向的值赋值到low所指的
            array[low] = array[high];

            while (array[low] < boss && high > low){
                low++;
            }
            array[high] = array[low];
        }
        //当low和high指向一起的时候，退出while
        array[low] = boss;

        quickSort(array,start,low-1);
        quickSort(array,low,end);
    }

    public static void show(int[] array){
        if(array.length == 0){
            System.out.println("数组空，无法show！");
            return;
        }
        System.out.println("-----------数组为：");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
