int graphEdges(boolean[][] matrix) {
    int c=0;
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix.length;j++)
            if(matrix[i][j])
                c++;
    }
    return c/2;
}
