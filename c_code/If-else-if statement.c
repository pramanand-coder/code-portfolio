#include <stdio.h>
int main() {

   int jediRank;
   
   printf("Enter a number from 1-4\n");
   scanf("%i" , &jediRank);
   
   if(jediRank == 1)
     printf("equals 1");
     else if(jediRank == 2)
       printf("equals 2");
     else if(jediRank == 3)
       printf("equals 3");
     else if(jediRank == 4)
       printf("equals 4");


  return 0;
}