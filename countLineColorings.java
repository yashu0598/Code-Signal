/*
Given the number of points on the line and the number of colors you have, find the number of the ways to color each point into one of the given colors in such manner that each two adjacent points will be different color.

Example

For points = 3 and colors = 2, the output should be
countLineColorings(points, colors) = 2.

*/

int countLineColorings(int points, int colors) {
    return colors * (int)Math.pow(colors-1, points-1);
}
