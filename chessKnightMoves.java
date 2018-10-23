/*

Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.



Example

For cell = "a1", the output should be
chessKnightMoves(cell) = 2.



For cell = "c2", the output should be
chessKnightMoves(cell) = 6.


*/





int chessKnightMoves(String cell) {

  class Helper {
    boolean isValid(int pos) {
      if (0 <= pos && pos < 8) {
        return true;
      }
      return false;
    }

    int getX(String pos) {
      return pos.charAt(0) - 'a';
    }

    int getY(String pos) {
      return pos.charAt(0) - '1';
    }
  }
  Helper h = new Helper();

  int current_x = h.getX(cell.substring(0, 1));
  int current_y = h.getY(cell.substring(1, 2));
  int result = 0;

  for (int dx = -2; dx <= 2; dx++) {
    for (int dy = -2; dy <= 2; dy++) {
      if ( Math.abs(dx*dy)==2) {
        if (h.isValid(current_x + dx) && h.isValid(current_y + dy)) {
          result++;
        }
      }
    }
  }
  return result;

}
