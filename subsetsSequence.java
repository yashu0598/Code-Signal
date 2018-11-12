boolean subsetsSequence(int[][] sets) {

  class Helper {
    boolean isSubset(int[] setA, int[] setB) {
      int j = 0;
      for (int i = 0; i < setB.length; i++) {
          if(j<setA.length&&setA[j]==setB[i])
            j++;
      }
      if (j == setA.length) {
        return true;
      }
      else {
        return false;
      }
    }
  };

  Helper h = new Helper();

  int[] supersets = new int[sets.length];

  for (int i = 0; i < sets.length; i++) {
    Arrays.sort(sets[i]);
  }

  for (int i = 0; i < sets.length; i++) {
    for (int j = i + 1; j < sets.length; j++) {
      if (h.isSubset(sets[i], sets[j])) {
        supersets[i]++;
      }
      if (h.isSubset(sets[j], sets[i])) {
        supersets[j]++;
      }
    }
  }

  Arrays.sort(supersets);

  for (int i = 0; i < sets.length; i++) {
    if (supersets[i] < i) {
      return false;
    }
  }

  return true;
}
