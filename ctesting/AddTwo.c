#include <stdio.h>

int main() {

    int number1, number2, sum;
3
    printf("Enter 2 integers: ");
    scanf("%d %d", &number1, &number2);

    // calculate sum
    sum = number1 + number2;
    printf("%d + %d = %d", number1, number2, sum);
    return 0;
}