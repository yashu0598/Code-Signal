String removeDuplicateCharacters(String str) {
  HashMap<Character, Integer> charCount = new HashMap<>();
  StringBuilder newStr = new StringBuilder();
  for(int i = 0; i < str.length(); i++) {
    char symbol = str.charAt(i);
    if(charCount.containsKey(symbol)) {
      charCount.put(symbol, charCount.get(symbol) + 1);
    } else {
      charCount.put(symbol, 1);
    }
  }
  for(int i = 0; i < str.length(); i++) {
    if(charCount.get(str.charAt(i)) == 1) {
      newStr.append(str.charAt(i));
    }
  }
  return newStr.toString();
}
