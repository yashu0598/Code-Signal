
/*
The positive divisor of X is called trivial if it is equal to 1 or to X. All other positive divisors are called non-trivial.

Given array of integers superset and integer n, find the number of integers between 1 and n, inclusive, such that for each of these integers superset is the superset of its non-trivial divisors (i.e. it contains all of them).

Example

For superset = [3, 2] and n = 13, the output should be
divisorsSuperset(superset, n) = 10.

Here are these numbers: 1, 2, 3, 4, 5, 6, 7, 9, 11, 13.

*/
int divisorsSuperset(int[] superset, int n) {

  class Helper {
    boolean isInSequence(int[] sequence, int elem) {
      for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == elem) 
                        return true;
      }
      return false;
    }
  };

  int res = 0;
  Helper h = new Helper();

  for (int i = 1; i <= n; i++) {
    boolean correct = true;
    for (int j = 2; j * j <= i; j++) {
      if (i % j == 0) {
        if (!h.isInSequence(superset, j) || !h.isInSequence(superset, i / j)) {
          correct = false;
          break;
        }
      }
    }
    if (correct) {
      res++;
    }
  }

  return res;
}
