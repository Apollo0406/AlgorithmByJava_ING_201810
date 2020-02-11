package parsearray;

/**
 * 1.普通数组转换为稀疏数组
 * 2.稀疏数组还原为普通数组
 */
public class parseArray {
    public static void main(String[] args) {
        //1.创建一个普通数组并打印
        int[][] array = new int[7][7];
        array[1][3] = 1;
        array[2][4] = 2;
        array[2][5] = 2;
        //2.打印数组
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        //3.遍历原数组，找出有效数据的个数——》得到有效数据个数后，就能确定稀疏数组的行数=有效数据个数+1
        int count = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] != 0){
                    count++;
                }
            }
        }
        //4.确定稀疏数组的大小
        int[][] parseArr = new int[count+1][3];

        //5.给稀疏数组的第一行元素赋值
        parseArr[0][0] = array.length;
        parseArr[0][1] = array[0].length;
        parseArr[0][2] = count;

        //6.再次遍历原数组，确定有效数据的下标，存进稀疏数组
        int c = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] != 0){
                    c++;
                    parseArr[c][0] = i;
                    parseArr[c][1] = j;
                    parseArr[c][2] = array[i][j];
                }
            }
        }

        //7.输出稀疏数组
        System.out.println("稀疏数组如下~~~~~~~~~~");
        for(int i = 0; i < parseArr.length; i++){
            for(int j = 0; j < parseArr[0].length; j++){
                System.out.print(parseArr[i][j]+" ");
            }
            System.out.println();
        }


        //1.将稀疏数组parseArr恢复成原始数组
        //读取parseArr的第一行前俩个元素可以确定oldArr的大小
        int[][] oldArr = new int[parseArr[0][0]][parseArr[0][1]];
        //遍历parseArr，从第二行开始，往oldArr里面塞数据
        for(int i = 1; i < parseArr.length; i++){
                oldArr[parseArr[i][0]][parseArr[i][1]] = parseArr[i][2];
        }

        //2.打印oldArr
        System.out.println("oldArr为~~~~~~~~~~~~~~~~~~~~~");
        for(int i = 0; i < oldArr.length; i++){
            for(int j = 0; j < oldArr[0].length; j++){
                System.out.print(oldArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
