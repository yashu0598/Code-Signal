int[] zFunctionNaive(String s) {
int[] result = new int[s.length()];
  for (int i = 0; i < s.length(); i++) {
    result[i]=0;
    for (int j = i; j < s.length(); j++) {
      if (s.charAt(j) == s.charAt(result[i])) {
        result[i]++;
      } else {
        break;
      }
    }
  }
  return result;
}
