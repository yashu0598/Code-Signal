/*
Consider a robot standing on a 2-dimensional grid at point (0, 0). It follows a sequence of instructions.

Each instruction is processed as follows:

'L' decreases the first coordinate by one,
'R' increases the first coordinate by one,
'U' increases the second coordinate by one,
'D' decreases the second coordinate by one.
But the robot isn't allowed to leave a pre-defined square (with sides parallel to the axes) centered at (0,0). If the execution of the current instruction would lead to the robot leaving the square, that instruction is just ignored.

Given a sequence of instructions and a restricting square, output an array of two integers representing the final position of the robot after executing all the instructions.

Example

For instructions = "LLLLUUUUDR" and bound = 2, the output should be
robotPath(instructions, bound) = [-1, 1].

The restricting square is (2, 2), (2, -2), (-2, -2), (-2, 2).

*/


std::vector<int> robotPath(std::string dir, int bound) {
    int x{0};
    int y{0};
    for (char c : dir) {
        int next_x{x};
        int next_y{y};
        if (c == 'L') {
            --next_x;
        } else if (c == 'R') {
            ++next_x;
        } else if (c == 'U') {
            ++next_y;
        } else if (c == 'D') {
            --next_y;
        }
        if (next_x <= bound && next_x >= - bound) {
            x = next_x;
        }
        if (next_y <= bound && next_y >= -bound) {
            y = next_y;
        }
    }
    return {x, y};
}
