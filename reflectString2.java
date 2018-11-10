String reflectString(String inputString) {

  StringBuilder result = new StringBuilder();
  for (int i = 0; i < inputString.length(); i++) {
    int order = (int)inputString.charAt(i) - (int)'a',
        reflectedCharCode = (int)'a' + 25 - order;
    result.append( (char)reflectedCharCode);
  }

  return result.toString();
}
