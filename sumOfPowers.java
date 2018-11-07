int sumOfPowers(int n, int divisor) {
  int s = 0;
  for (int i = 1; i <= n; i++) {
    int k = 0;
    while (i % (int)Math.pow(divisor, k) == 0) {
      k++;
    }
    s += k - 1;
  }
  return s;
}
