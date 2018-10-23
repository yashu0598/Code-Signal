Find the sum of squares of all integers from 1 up to and including given N.

Example

For n = 5, the output should be
sumOfSquares(n) = 55.



int sumOfSquares(int n) {
    return n*(n+1)*(2*n+1)/6;
}
