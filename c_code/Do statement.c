#include <stdio.h>
int main() {

  int count = 1, numbers;
  int total = 0;
  float average;
  
  do {
       printf("Enter number #%i:", count);
       scanf("%i", &numbers);
       total = total + numbers;
       count++;
  
  }
  while(count <= 5);
  
  average = total / 5;
  printf("Average = %f",average);
  
  
  return 0;
}