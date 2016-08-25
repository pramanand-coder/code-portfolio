#include <stdio.h>
int main() {

    int jediRank [7] = {35,264,15,41, 1436,34,14};
    
    int sum, index;

    for(index = 0; index < 7; index++)
       sum = sum + jediRank[index];

    printf("%i", sum);


  return 0;
}