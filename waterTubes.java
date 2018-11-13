int waterTubes(int[] water, int[] flowPerMinute) {
  int result = 0;

  for (int i = 0; i < water.length; i++) {
    int minutes = water[i] / flowPerMinute[i];
    if (water[i] % flowPerMinute[i] != 0) {
      minutes++;
    }
    if (result < minutes) {
      result = minutes;
    }
  }
  return result;
}
