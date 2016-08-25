#include <stdio.h>
int main() {

// % = modulus

  int a = 21, b = 7, c = 10;
  int result;
  
  result = a % b;
  printf("a %% b = %i\n",result);
  
  result = a % c;
  printf("a %% c = %i\n", result);
  
// 2 percent signs in printf will show only one to demonstrate modulus use

  return 0;
}