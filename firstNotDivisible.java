int firstNotDivisible(int[] divisors, int start) {

  for (int answer = start; ; answer++) {
    boolean correct = true;
    for (int i = 0; i < divisors.length; i++) {
      if (answer % divisors[1] == 0) {
        correct = false;
        break;
      }
    }
    if (correct) {
      return answer;
    }
  }
}
