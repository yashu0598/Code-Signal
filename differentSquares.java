int differentSquares(int[][] matrix) {
  Set<Integer> s = new HashSet<Integer>();
    for(int i = 0;i < matrix.length - 1;i++)
        for(int j = 0;j < matrix[0].length - 1;j++)
            s.add(Integer.parseInt(""+matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1]));
    return s.size();
}
