#include <stdio.h>

int main()
{
   
   int sum = 0;

   int i;

   for(i = 0; i <= 100; i++)
   {
       sum = sum + i;
   }

   printf("%d\n", sum);
}