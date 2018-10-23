/*

Proper nouns always begin with a capital letter, followed by small letters.

Correct a given proper noun so that it fits this statement.

Example

For noun = "pARiS", the output should be
properNounCorrection(noun) = "Paris";
For noun = "John", the output should be
properNounCorrection(noun) = "John".


*/


String properNounCorrection(String noun) {

  class Helper {
    boolean isLowerCase(char symbol) {
      if ('a' <= symbol && symbol <= 'z') {
        return true;
      }
      return false;
    }
  };
  Helper h = new Helper();

  StringBuilder result = new StringBuilder();

  if (h.isLowerCase(noun.charAt(0))) {
    result.append((char) (noun.charAt(0) - 'a' + 'A'));
  }
  else {
    result.append(noun.charAt(0));
  }

  for (int i = 1; i < noun.length(); i++) {
    if (!h.isLowerCase(noun.charAt(i))) {
      result.append((char) (noun.charAt(i) - 'a' + 'A'));
    }
    else {
      result.append(noun.charAt(i));
    }
  }

  return result.toString();
}
