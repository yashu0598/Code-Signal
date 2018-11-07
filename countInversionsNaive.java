int countInversionsNaive(int[] inputArray) {

  int result = 0;

  for (int i = 0; i < inputArray.length; i++) {
    for (int j = 0; j < inputArray.length; j++) {
      if (inputArray[i] > inputArray[j]) {
        result++;
      }
    }
  }
  return result;
}
