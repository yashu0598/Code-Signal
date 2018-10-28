/*

Given a set of points on the plane, find the area of its axis-aligned minimum bounding box.

Example

For x = [1, 0, 4] and y = [-1, 2, 2], the output should be
axisAlignedBoundingBox(x, y) = 12.

In the image below points are given in blue, and the axis-aligned minimum bounding box is given in red. Its area is 3 * 4 = 12.

*/
int axisAlignedBoundingBox(int[] x, int[] y) {

  int minX = x[0],
      maxX = x[0],
      minY = y[0],
      maxY = y[0];

  for (int i = 1; i < x.length; i++) {
    minX = Math.min(x[i], minX);
    maxX = Math.max(x[i], maxX);
    minY = Math.min(y[i], minY);
    maxY = Math.max(y[i],maxY) ;
  }

  return (maxX - minX) * (maxY - minY);
}
