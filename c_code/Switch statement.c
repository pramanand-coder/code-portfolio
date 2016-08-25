#include <stdio.h>
int main() {

    int jediRank;
    scanf("%i", &jediRank);

    switch(jediRank){
      case 25:
          printf("what up");
          break;
      case 50:
          printf("hello");
          break;
      case 14:
          printf("hola");
      default:
          printf("heyo");
          break;
      
      
      }

  return 0;
}