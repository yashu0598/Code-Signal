/*
For a string consisting of only '(', ')', '[' and ']', determine if it is a regular bracket sequence or not.

Example

For sequence = "[()()]", the output should be
regularBracketSequence2(sequence) = true.

*/
bool regularBracketSequence2(std::string sequence) {

  std::vector<int> Stack;
  for (int i = 0; i < sequence.size(); i++) {
    if (Stack.size()
        && Stack[(int)Stack.size() - 1] == '(' && sequence[i] == ')') {
      Stack.pop_back();
      continue;
    }
    if (Stack.size()
        && Stack[(int)Stack.size() - 1] == '[' && sequence[i] == ']') {
      Stack.pop_back();
      continue;
    }
    Stack.push_back(sequence[i]);
  }

  if (Stack.size()) {
    return false;
  }
  return true;
}
