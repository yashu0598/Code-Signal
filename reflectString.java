String reflectString(String inputString) {

  StringBuilder result = new StringBuilder();
  for (int i = 0; i < inputString.length(); i++) {
    int order = (int)inputString.charAt(i),
        reflectedCharCode = 2*(int)'a' + 25 - order;
    result.append( (char)reflectedCharCode);
  }

  return result.toString();
}
