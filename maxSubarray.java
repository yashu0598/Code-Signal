int maxSubarray(int[] inputArray) {
  int currentMax = 0;
  int max = 0;

  for (int i = 0; i < inputArray.length; i++) {
    currentMax = Math.max(0, currentMax + inputArray[i]);
    max = Math.max(max,currentMax);
  }

  return max;
}
