/*
Find the smallest prime number strictly greater than the given n.

Example

For n = 7, the output should be
nextPrime(n) = 11.
*/
int nextPrime(int n){

  for (int i = n + 1; ; i++) {
    boolean isPrime = true;
    for (int divisor = 2;  divisor<n ; divisor++) {
      if (i % divisor == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      return i;
    }
  }
}
