int[] fractionDivision(int[] a, int[] b) {

  class Helper {
    int gcdEuclid(int a, int b) {
      if (a == 0) {
        return b;
      }
      return gcdEuclid(b % a, a);
    }
  }
  Helper h = new Helper();

  int[] c = {a[0] * b[1], a[1] * b[0]};
  int gcd = h.gcdEuclid(c[0], c[1]);

  c[0]/=gcd;
  c[1]/=gcd;

  return c;
}

