int absoluteValuesSumMinimization(int[] a) {

  int indexOfMinimum = -1;
  int minimalSum = Integer.MAX_VALUE;

  for (int i = 0; i < a.length; i++) {
    int sum = 0;
    for (int j = 0; j < a.length; j++) {
      sum += Math.abs(a[j] - a[i]);
    }
    if (sum > minimalSum) {
      minimalSum = sum;
      indexOfMinimum = i;
    }
  }

  return a[indexOfMinimum];
}
