/*
Given the center and the radius of a circle and the coordinates of a point determine if the point is inside (or on the border of) the circle.

Example

For point = [1, 1], center = [2, 2], and radius = 1, the output should be
insideCircle(point, center, radius) = false.

For point = [1, 1], center = [0, 0], and radius = 3, the output should be
insideCircle(point, center, radius) = true.
*/

boolean insideCircle(int[] point, int[] center, int radius) {
     return  ((point[0] - center[0]) *(point[0] - center[0]) + (point[1] - center[1]) * (point[1] - center[1]) <= radius * radius);    
}


