boolean coolString(String inputString) {

  class Helper {
    boolean isLowercase(char symbol) {
      if ('a' <= symbol && symbol <= 'z') {
        return true;
      }
      return false;
    }

    boolean isUppercase(char symbol) {
      if ('A' <= symbol && symbol <= 'Z') {
        return true;
      }
      return false;
    }
  }
  Helper h = new Helper();

  boolean firstIsLowercase = h.isLowercase(inputString.charAt(0));
  boolean firstIsUppercase = h.isUppercase(inputString.charAt(0));

  if (!(firstIsLowercase || firstIsUppercase)) {
    return false;
  }

  for (int i = 1; i < inputString.length(); i++) {
    if (i % 2 == 1) {
      if (h.isLowercase(inputString.charAt(i)) == firstIsLowercase ||
          h.isUppercase(inputString.charAt(i)) == firstIsUppercase) {
        return false;
      }
    } else {
        if(! (h.isLowercase(inputString.charAt(i)) == firstIsLowercase ||
          h.isUppercase(inputString.charAt(i)) == firstIsUppercase)) {
        return false;
      }
    }
  }

  return true;
}
