#include<stdio.h>

void doTowers(int n,char X,char Y,char Z){
    if(n == 1)
        printf("Dish 1 from %c to %c \n",X,Z);
    else{
        doTowers(n-1,X,Z,Y);   //先将n-1个盘子借助Z从X挪到Y，为了方便将最下面的盘子直接挪到目的针
        printf("Dish %d from %c to %c \n",n,X,Z);   //把最下面的盘子直接从源挪到目的
        doTowers(n-1,Y,X,Z);  //把移到Y针上的n-1个盘子再挪到最终目的针Z上
    }
}
int main(){
    int n;
    printf("Enter the count of dishes: \n");
    scanf("%d",&n);
    printf("The answer is :\n");
    doTowers(n,'X','Y','Z');         //参数分别为：盘子数、源、中介、目标
}


