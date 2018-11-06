int commonPoints(int l1, int r1, int l2, int r2) {
  int result = Math.min(r2, r1) - Math.max(l2, l1) - 1;
  if (result < 0) {
    result = 0;
  }
  return result;
}
