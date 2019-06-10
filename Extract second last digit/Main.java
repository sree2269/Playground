#include<stdio.h>
int main()
{
  static int a;
  int b;
  scanf("%d",&a);
  b= (a%100)/10;
  printf("%d",b);
  return 0;
}