/*

Two lines ax + by + c = 0 and a'x + b'y + c' = 0 are orthogonal if and only if
a * a' + b * b' = 0.

Check if the two given lines are orthogonal.

Example

For line1 = [1, -1, 0] and line2 = [1, 1, 0], the output should be
orthogonalLines(line1, line2) = true.

*/


boolean orthogonalLines(int[] line1, int[] line2) {
    return line1[0]*line2[0]+line1[1]*line2[1]==0;
}
