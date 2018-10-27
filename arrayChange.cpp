/*
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.
*/

int arrayChange(std::vector<int> inputArray) {

  int result = 0;

  for (int i = 1; i < inputArray.size(); i++) {
    if (inputArray[i] <= inputArray[i - 1]) {
      int d{inputArray[i - 1] - inputArray[i] + 1};
      result += d;
      inputArray[i] += d;
    }
  }
  return result;
}
