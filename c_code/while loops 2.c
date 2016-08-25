#include <stdio.h>
int main() {

  int count = 1, numbers;
  int total = 0;
  float average;
  
  while(count <= 5) {
       printf("Enter number #%i:", count);
       scanf("%i", &numbers);
       total = total + numbers;
       count++;
  
  }
  average = total / 5;
  printf("Average = %f",average);
  
  
  return 0;
}