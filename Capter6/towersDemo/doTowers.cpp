#include<stdio.h>

void doTowers(int n,char X,char Y,char Z){
    if(n == 1)
        printf("Dish 1 from %c to %c \n",X,Z);
    else{
        doTowers(n-1,X,Z,Y);   //�Ƚ�n-1�����ӽ���Z��XŲ��Y��Ϊ�˷��㽫�����������ֱ��Ų��Ŀ����
        printf("Dish %d from %c to %c \n",n,X,Z);   //�������������ֱ�Ӵ�ԴŲ��Ŀ��
        doTowers(n-1,Y,X,Z);  //���Ƶ�Y���ϵ�n-1��������Ų������Ŀ����Z��
    }
}
int main(){
    int n;
    printf("Enter the count of dishes: \n");
    scanf("%d",&n);
    printf("The answer is :\n");
    doTowers(n,'X','Y','Z');         //�����ֱ�Ϊ����������Դ���н顢Ŀ��
}


