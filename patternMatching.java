boolean patternMatching(String input, String pattern) {

  boolean[][] dp = new boolean[input.length() + 1][pattern.length() + 1];

  dp[0][0]=true;  
  for (int i = 0; i <= input.length(); i++) {
    for (int j = 0; j < pattern.length(); j++) {
      if (!dp[i][j]) {
        continue;
      }
      if (i < input.length()
       && (input.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?')) {
        dp[i + 1][j + 1] = true;
      }
      if (pattern.charAt(j) == '*') {
        for (int k = 0; i + k <= input.length(); k++) {
          dp[i + k][j + 1] = true;
        }
      }
    }
  }

  return dp[input.length()][pattern.length()];
}
