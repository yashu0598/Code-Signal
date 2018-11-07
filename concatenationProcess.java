String concatenationProcess(String[] initialArray) {

  List<String> vector = new ArrayList<>(Arrays.asList(initialArray));

  while (vector.size() > 1) {
    int minInd1 = 0,
        minInd2 = vector.size() - 1;

    for (int i = 1; i < vector.size(); i++) {
      if (vector.get(i).length() < vector.get(minInd1).length()) {
        minInd1 = i;
      }
    }

    if (minInd2 == minInd1) {
      minInd2--;
    }

    for (int i = vector.size() - 2; i >= 0; i--) {
      if (vector.get(i).length() < vector.get(minInd2).length()
       && i != minInd1) {
        minInd2 = i;
      }
    }

    vector.add(vector.get(minInd1) + vector.get(minInd2));
    vector.remove(vector.get(Math.max(minInd1, minInd2)));
    vector.remove(vector.get(Math.min(minInd1, minInd2)));
  }

  return vector.get(0);
}
