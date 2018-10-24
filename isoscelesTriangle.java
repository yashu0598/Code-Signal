/*

Given length of a triangle sides, check if it is isosceles.

Example

For sides = [4, 3, 2], the output should be
isoscelesTriangle(sides) = false;
For sides = [5, 3, 5], the output should be
isoscelesTriangle(sides) = true.
*/

boolean isoscelesTriangle(int[] sides) {
    if(sides[0]==sides[1]||sides[1]==sides[2]||sides[2]==sides[0])
        return true;
    return false;
}
