package quiz3.bubbleSort;

/**
 * 基础版的冒泡排序
 */
public class basicBubbleSort {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,7,-1,9,-4};
        show(array1);
        bubbleSort(array1);
        show(array1);
    }

    public static void bubbleSort(int[] array){
        /**
         * 当数组只有一个元素或为空时，不处理
         */
        if(array.length == 0 || array.length == 1){
            return;
        }

        int temp = 0; //临时变量用来交换数据
        boolean flag = false; //记录某次循环内是否有元素移动

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1-i; j++){
                if(array[j] > array[j+1]){ //交换
                    flag = true;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(!flag){  //没有出现交换
                break; //提前结束循环
            }else{
                flag = false;
            }
        }
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
