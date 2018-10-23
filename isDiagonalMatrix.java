/*
Check if the given matrix is diagonal.

Example

For

matrix = [[1, 0, 0], 
          [0, 5, 0], 
          [0, 0, 3]]
the output should be
isDiagonalMatrix(matrix) = true;

For

matrix = [[1, 0, 0], 
          [0, 5, 0], 
          [2, 0, 3]]
the output should be
isDiagonalMatrix(matrix) = false.
*/

boolean isDiagonalMatrix(int[][] matrix) {

  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix.length; j++) {
      if (matrix[i][j] != 0 || i != j) {
        return false;
      }
    }
  }
  return true;
}
