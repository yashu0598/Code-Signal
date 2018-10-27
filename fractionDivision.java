/*
Implement a function that can divide two fractions and produce a reduced fraction.

Example

For a = [2, 3] and b = [5, 6], the output should be
fractionDivision(a, b) = [4, 5].
*/


 int gcdEuclid(int a, int b) {
      if (a == 0) {
        return b;
      }
      return gcdEuclid(b % a, a);
    }
int[] fractionDivision(int[] A, int[] B) {

 int C[]=new int[2];
  C[0] = A[0] * B[1];;
  C[1] = A[1] * B[0];
  int gcd = gcdEuclid(C[0], C[1]);

  C[0] /= gcd;
  C[1] /= gcd;

  return C;
}
