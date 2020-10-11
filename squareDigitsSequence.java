int squareDigitsSequence(int a0) {

  int cur = a0;
  Set<Integer> was = new HashSet<>();

  while (!was.contains(cur)) {
    was.add(cur);
    int next = 0;
    while (cur > 0) {
      next += (cur % 10) * (cur % 10);
      cur /= 10;
    }
    cur = next;
  }

  return was.size() + 1;
}
