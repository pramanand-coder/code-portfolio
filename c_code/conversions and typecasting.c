#include <stdio.h>
int main() {

  /*int a = 20;
  int b = 12;
  */
  float a = 20.12;
  float b = 12.47;
  
    //float sum = a + b;
    //int sum = a + b;
  float sum = (int) a + b;
  
    printf("a + b = %f\n" , sum);
    //printf("a + b = %i\n" , sum);
   

  return 0;
}