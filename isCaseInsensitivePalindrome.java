boolean isCaseInsensitivePalindrome(String inputString) {

  for (int i = 0; i < inputString.length() / 2; i++) {
    char[] c = {
        inputString.charAt(i),
        inputString.charAt(inputString.length() - i - 1)
    };
    for (int j = 0; j < 2; j++) {
      if (c[j] >= 'a' && c[j] <= 'z') {
        c[j] = (char) (c[j] - 'a' + 'A');
      }
    }
    if (c[0] != c[1]) {
      return false;
    }
  }

  return true;
}
