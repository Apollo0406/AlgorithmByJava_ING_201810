package quiz2.recurrsion.migong;

/**
 * 二维数组模拟迷宫
 * 1代表墙
 * 2代表是通路
 * 3代表走过了没走通
 */
public class migong {
    public static void main(String[] args) {
        myMig mig = new myMig();
        System.out.println("初始的迷宫：");
        mig.show();
        //传入起始点，和迷宫出口
        if(mig.play(1,1)) //从1，1开始走
        System.out.println("play之后的迷宫：");
        mig.show();
    }
}

 class myMig{

     //1.初始化迷宫
     int[][] mig = new int[8][7];

     public myMig(){
         //上下俩行置为1
         for(int i = 0; i < 7; i++) {
             mig[0][i] = 1;
             mig[7][i] = 1;
         }
         for(int i = 1; i < 6; i++){
             mig[i][0] = 1;
             mig[i][6] = 1;
         }

         mig[3][1] = 1;
         mig[3][2] = 1;

         //再加一个挡板
         mig[2][2] = 1;
     }


     //2.输出原始迷宫
     public void show(){
         for(int i = 0; i < 8; i++){
             for(int j = 0; j < 7; j++){
                 System.out.print(mig[i][j]+" ");
             }
             System.out.println();

         }
     }

     //3.play玩迷宫游戏
     //i,j指的是初始位置
     //出口为mig[6][5]
     //探测策略为：下右上左
     public boolean play(int i,int j){
         if(mig[6][5] == 2){
             System.out.println("小球从起点可以走到出口");
             return true;
         }else if(mig[i][j] == 0){ //该点还没有走过
             //假定该点可以走通
             mig[i][j] = 2;
             //开始探测
             if(play(i+1,j)){  //下面
                 return true;
             }else if(play(i,j+1)){  //右边
                 return true;
             }else if(play(i-1,j)){  //上
                 return true;
             }else if(play(i,j-1)){
                 return true;
             }else{  //都没走通
                 mig[i][j] = 3;  //说明这个点走不通，死路
                 return false;
             }
         }else{ //假设mig[i][j]不为0，则可能是1，2，3
            return false;
         }
     }

}

