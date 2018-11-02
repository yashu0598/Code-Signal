boolean regularBracketSequence2(String sequence) {

  LinkedList<Character> stack = new LinkedList<>();
  for (int i = 0; i < sequence.length(); i++) {
    if (stack.size() > 0
        && stack.getLast() == '(' && sequence.charAt(i) == ')') {
      stack.pollLast();
      continue;
    }
    if (stack.size() > 0
        && stack.getLast() == '[' && sequence.charAt(i) == ']' ) {
      stack.pollLast();
      continue;
    }
    stack.addLast(sequence.charAt(i));
  }

  if (stack.size() != 0) {
    return false;
  }
  return true;
}
