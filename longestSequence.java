/*
Given a sequence of integers find the length of its largest subsequence that forms an arithmetic progression.

Example

For a = [1, 7, 3, 5, 4, 2], the output should be
longestSequence(a) = 3.

Explanation: [1, 3, 5] is a subsequence that's also an arithmetic progression.

*/
int longestSequence(int[] a) {

  int best = 1;
  for (int i = 0; i < a.length; i++) {
    for (int j = i + 1; j < a.length; j++) {
      int diff =  a[j]-a[i] ;
      if (diff == 0) {
        continue;
      }
      int cur = 1;
      int last = a[i];
      for (int k = j; k < a.length; k++) {
        if (a[k] - last == diff) {
          cur++;
          last = a[k];
        }
      }
      if (cur > best) {
        best = cur;
      }
    }
  }

  return best;
}
