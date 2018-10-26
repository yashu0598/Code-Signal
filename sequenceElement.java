/*
Consider an infinite sequence a of decimal digits which is generated using the following algorithm:

the first 5 digits are initially given;
for i > 4, a[i] = (a[i - 5] + a[i - 4] + a[i - 3] + a[i - 2] + a[i - 1]) % 10, i.e. each element starting with the fifth is the sum of the previous five elements modulo 10.
Given the initial five elements, You need to find the nth element of the sequence (the first element has index 0).

Example

For a = [1, 2, 3, 4, 5] and n = 9, the output should be
sequenceElement(a, n) = 4.

If the sequence starts with digits 1 2 3 4 5 then it continues like this:
1 2 3 4 5 5 9 6 9 4 3 1 3 0 ..., so for n = 9 the answer will be 4.

*/

int sequenceElement(int[] a, int n) {

  final int MOD = (int) 1e5;
  List<Integer> seq = new ArrayList<>();
  for (int i = 0; i < 5; i++) {
    seq.add(a[i]);
  }

  int lastFive = a[0] * (int)1e4 + a[1] * (int)1e3 +
                 a[2] * (int)1e2 + a[3] * 10 + a[4];
  Map<Integer, Integer> was = new HashMap<>();
  was.put(lastFive, 4);

  for (int i = 0;; i++) {
    seq.add((seq.get(i - 1) + seq.get(i - 2) +
              seq.get(i - 3) + seq.get(i - 4) + seq.get(i - 5)) % 10);
    lastFive = (lastFive * 10 + seq.get(i)) % MOD;
    if (was.containsKey(lastFive)) {
      int last = was.get(lastFive);
      return seq.get(n % (i - last));
    } else {
      was.put(lastFive, i);
    }
  }
}
