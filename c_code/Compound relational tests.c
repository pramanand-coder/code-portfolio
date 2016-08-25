#include <stdio.h>
int main() {

   int jediRank;
   
   printf("Enter a number from 1-4\n");
   scanf("%i" , &jediRank);
   // use of && ||
   
   /*if(jediRank == 1 || jediRank == 2)
     printf("nice");*/
   if(jediRank < 5 && jediRank > 1)
     printf("nice");
   


  return 0;
}