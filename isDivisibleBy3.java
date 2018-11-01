ArrayList<String> isDivisibleBy3(String inputString) {

  int digitSum = 0;
  int leftBound =  (int) '0';
  int rightBound = (int) '9';
  ArrayList<String> answer = new ArrayList<>();
  int asteriskPos = -1;
  StringBuilder input = new StringBuilder(inputString);

  for (int i = 0; i < inputString.length(); i++) {
    if (leftBound <= (int) inputString.charAt(i) &&
       (int) inputString.charAt(i) <= rightBound) {
         digitSum += (int) inputString.charAt(i) - leftBound;
    }
    else {
      asteriskPos = i;
    }
  }

  for (int i = 0; i < 10; i++) {
    if ((digitSum + i) % 3 == 0) {
      input.setCharAt(asteriskPos, (char) (leftBound + i));
      answer.add(input.toString());
    }
  }

  return answer;
}
