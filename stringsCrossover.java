/*
Define crossover operation over two equal-length strings A and B as follows:

the result of that operation is a string of the same length as the input strings
result[i] is either A[i] or B[i], chosen at random
Given array of strings inputArray and a string result, find for how many pairs of strings from inputArray the result of the crossover operation over them may be equal to result.

Note that (A, B) and (B, A) are the same pair. Also note that the pair cannot include the same element of the array twice (however, if there are two equal elements in the array, they can form a pair).

Example

For inputArray = ["abc", "aaa", "aba", "bab"] and result = "bbb", the output should be
stringsCrossover(inputArray, result) = 2.
*/

int stringsCrossover(String[] inputArray,
                     String result) {

  int answer = 0;

  for (int i = 0; i < inputArray.length; i++) {
    for (int j = i + 1; j < inputArray.length; j++) {
      boolean correct = true;
      for (int k = 0; k < result.length(); k++) {
        if (result.charAt(k) != inputArray[i].charAt(k)
            && result.charAt(k) != inputArray[j].charAt(k)) {
          correct=false;
        }
      }
      if (correct) {
        answer++;
      }
    }
  }
  return answer;
}
