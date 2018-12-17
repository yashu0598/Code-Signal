boolean isInformationConsistent(int[][] evidences) {

  for (int j = 0; j < evidences[0].length; j++) {
    boolean innocent = false,
            guilty = false;
    for (int i = 0; i < evidences.length; i++) {
      switch (evidences[i][j]) {
        case -1:
          innocent = true;
          break;
        case 1:
          guilty = true;
          break;
      }
    }

    if (innocent && guilty) {
      return false;
    }
  }

  return true;
}
