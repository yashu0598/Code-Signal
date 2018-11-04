boolean checkEqualFrequency(int[] inputArray) {

  int numberOfEqual = 1;

  Arrays.sort(inputArray);

  while (numberOfEqual < inputArray.length
      && inputArray[numberOfEqual - 1] == inputArray[numberOfEqual]) {
    numberOfEqual++;
  }

  if (inputArray.length % numberOfEqual != 0) {
    return false;
  }

  for (int i = 0; i < inputArray.length; i += numberOfEqual) {
    if (i != 0 && inputArray[i] == inputArray[i - 1]) {
      return false;
    }
    for (int j = i + 1; j < i + numberOfEqual; j++) {
      if (inputArray[j] != inputArray[j - 1]) {
        return false;
      }
    }
  }

  return true;
}
