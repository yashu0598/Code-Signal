/*
Given an integer n, check if n = k! for some non-negative integer k.

Example

For n = 120, the output should be
checkFactorial(n) = true.

Here 120 = 5!.

For n = 25, the output should be
checkFactorial(n) = false.

Here 4! = 24 < 25 < 120 = 5!.
*/

boolean checkFactorial(int n) {
int sum=1;
    for(int i=1;sum<n;i++)
        sum*=i;
    return sum==n;
}   
