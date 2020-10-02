int visitsOnCircularRoad(int n, int[] visitsOrder) {
  int current = 1,
      res = 0;
  for (int i = 0; i < visitsOrder.length; i++) {
    res += Math.min(Math.abs(visitsOrder[i] - current),
        n - Math.abs(visitsOrder[i] - current));
    current = visitsOrder[i];
  }
  return res;
}
