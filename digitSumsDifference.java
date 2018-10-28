/*
Given an integer n, find the difference between the sums of its even and odd digits.

Example

For n = 412, the output should be
digitSumsDifference(n) = 5;
For n = 1203, the output should be
digitSumsDifference(n) = -2.

*/
int digitSumsDifference(int n) {

  int result = 0;
  while (n != 0) {
    int digit = n % 10;
    if (digit % 2 == 1) {
      result -= digit;
    }
    else {
      result += digit;
    }
    n /= 10;
  }

  return result;
}
