/*
Check if the given matrix is an identity matrix.

Example

For

matrix = [[1, 0, 0], 
          [0, 1, 0], 
          [0, 0, 1]]
the output should be
isIdentityMatrix(matrix) = true;

For

matrix = [[1, 0, 0], 
          [0, 0, 0], 
          [0, 0, 1]]
the output should be
isIdentityMatrix(matrix) = false
*/
boolean isIdentityMatrix(int[][] matrix) {
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[i].length;j++)
        {
            if(matrix[i][j]==1&&i!=j)
                return false;
            if(i==j&&matrix[i][j]!=1)
                return false;
        }
    }
    return true;
}
