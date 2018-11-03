int[] robotPath(String instructions, int bound) {

  int[] dx = {-1, 0, 1,  0};
  int[] dy = { 0, 1, 0, -1};
  int x = 0, y = 0;

  String directions = "LURD";

  for (int i = 0; i < instructions.length(); i++) {
    int dirIndex = 0;
    for (int j = 1; j < 4; j++) {
      if (instructions.charAt(i) == directions.charAt(j)) {
        dirIndex = j;
      }
    }
    if (Math.abs(x + dx[dirIndex]) <= bound
     && Math.abs(y + dy[dirIndex]) <= bound) {
       x =x+ dx[dirIndex]; y = y+dy[dirIndex];
    }
  }

  int[] res = new int[2];
  res[0] = x;
  res[1] = y;
  return res;
}
