#include <stdio.h>
int main() {

   int jediRank;
   
   printf("Enter your Jedi rank: ");
   scanf("%i" , &jediRank);
   
   if(jediRank == 100)
     printf("You have achieved Jedi Master Status!");
    
    if(jediRank > 100)
     printf("You are one awesome Jedi Master");
     
     if(jediRank < 100)
       printf("Keep going sucker");


  return 0;
}