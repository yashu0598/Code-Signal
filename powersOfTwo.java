int[] powersOfTwo(int n) {

  ArrayList<Integer> ans = new ArrayList<>();
  int cur = 1;
  while (n > 0) {
    if (n % 2 == 1) {
      ans.add(cur);
    }
    n>>=1;
      cur<<=1;
  }

  int[] a = new int[ans.size()];
  for (int i = 0; i < a.length; i++) {
    a[i] = ans.get(i);
  }

  return a;
}
