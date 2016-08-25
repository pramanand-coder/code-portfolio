#include <stdio.h>
int main() {
//PEMDAS is used
  int a = 15;
  int b = 10;
  int c = 5;
  int result;
  
  result = a + b;
  printf("a + b = %i\n" , result);
  
  result = a / c;
  printf("a / c = %i\n", result);

  result = a + b * c;
  printf("a + b * c = %i\n", result);

  return 0;
}