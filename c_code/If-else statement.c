#include <stdio.h>
int main() {

   int jediRank;
   
   printf("Enter your Jedi rank: ");
   scanf("%i" , &jediRank);
   
   if(jediRank >= 100)
     printf("You have achieved Jedi Master Status!");
     else
       printf("Keep goin' sucka!");

  return 0;
}