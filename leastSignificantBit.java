int leastSignificantBit(int n) {

  int ans = 1;
  while (n%2 == 0) {
    n >>= 1;
    ans <<= 1;
  }

  return ans;
}
