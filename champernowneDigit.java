int champernowneDigit(int n) {

  for (int i = 1; ; i++) {
    int number = i;
    ArrayList<Integer> digits = new ArrayList<>();
    while (number != 0) {
      digits.add(number % 10);
      number =  number/10;
    }
    Collections.reverse(digits);
    if (n <= digits.size()) {
      return digits.get(n - 1);
    }
    n -= digits.size();
  }
}
