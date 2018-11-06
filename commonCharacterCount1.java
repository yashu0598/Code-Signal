int commonCharacterCount(String s1, String s2) {
  HashMap<Character, Integer> map1 = new HashMap<>();
  HashMap<Character, Integer> map2 = new HashMap<>();
  int answer = 0;
  for (int i = 0; i < s1.length(); i++) {
    char ch = s1.charAt(i);
    map1.put(ch, map1.containsKey(ch) ? (map1.get(ch) + 1) : 1);
  }
  for (int i = 0; i < s2.length(); i++) {
    char ch = s2.charAt(i);
    map2.put(ch, map2.containsKey(ch) ? (map2.get(ch) + 1) : 1);
 }
  for (char ch = 'a'; ch <= 'z'; ch++) {
    if (map1.containsKey(ch) && map2.containsKey(ch)) {
      answer += Math.min(map1.get(ch), map2.get(ch));
    }
  }
  return answer;
}
