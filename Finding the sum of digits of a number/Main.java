#include <stdio.h>
int main() {
  int a,n=0,i=0,k=0;
	scanf("%d",&a);
  while(a!=0)
  {
    n=a%10;
    k=k+n;
    a=a/10;
    i=i+1;
  }
  printf("%d",k);
	return 0;
}