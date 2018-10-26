/*
Given an integer, find the number of the ways to change exactly one digit in it in order to obtain a bigger integer.

Example

For value = 10, the output should be
countWaysToChangeDigit(value) = 17.

*/
int countWaysToChangeDigit(int value) {
int answer = 0;
  while (value>0) {
    answer += 9 - value % 10;
    value /=  10 ;
  }
  return answer;
}
