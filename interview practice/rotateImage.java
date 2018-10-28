/*

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

*/


int[][] rotateImage(int[][] a) {
    int b[][]=new int[a.length][a[0].length];
    for(int i=a[0].length-1;i>=0;i--)
    {
        for(int j=0;j<a.length;j++)
        {
              b[i][a.length-1-j]=a[j][i];  
        }
    }
    return b;
}
