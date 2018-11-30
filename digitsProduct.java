int digitsProduct(int product) {
  ArrayList<Integer> answerDigits = new ArrayList<>();
  int answer = 0;

  if (product == 0) {
    return 10;
  }

  if (product == 1) {
    return 1;
  }

  for (int divisor = 9; divisor > 1; divisor--) {
    while (product % divisor == 0) {
      product /= divisor;
      answerDigits.add(divisor);
    }
  }

  if (product > 1) {
    return -1;
  }


  for (int i = answerDigits.size() - 1; i >= 0; i--) {
    answer =  answerDigits.get(i)+answer*10 ;
  }
  return answer;
}
