/*
Find the greatest common divisor of two given integers. Each integer is given in the form of its prime factorization - a sorted array of all prime factors of the number.

Example

For a = [2, 3, 3, 3, 5] and b = [2, 2, 2, 2, 3, 3], the output should be
factorizedGCD(a, b) = 18.

gcd(a, b) = gcd(270, 144).
*/

int factorizedGCD(int[] a, int[] b) {
  int j = 0,
      result = 0;
  for (int i = 0; i < a.length; i++) {
    while (j < b.length && a[i] > b[j]) {
      j++;
    }
    if (j < b.length && a[i] == b[j]) {
      result *= a[i];
      j++;
    }
  }
  return result;
}
