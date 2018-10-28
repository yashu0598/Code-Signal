int rightmostRoundNumber(int[] inputArray) {

  int ans = -1;
  for (int i = 0; i < inputArray.length; i++) {
    if (inputArray[i] % 10 == 0) {
      ans = inputArray[i];
    }
  }

  return ans;
}
