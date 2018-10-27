/*
Consider a piece of straw with a length of strawLength. You want to break it into smaller pieces with pairwise distinct positive integer lengths. What is the maximum possible number of smaller pieces that you can get from breaking the original piece?

Example

For strawLength = 14, the output should be
piecesOfDistinctLengths(strawLength) = 4.

One of the possible ways to break a straw with a length of 14 into 4 smaller pieces with pairwise distinct integer lengths is to make pieces with lengths of 1, 3, 4, and 6. It is impossible to obtain more than 4 smaller pieces.

*/
int piecesOfDistinctLengths(int strawLength) {
    int res{0};
    int i{1};
    while (true) {
        if (strawLength < i) {
            break;
        }
        strawLength -= i;
        ++i;
        ++res;
    }
    return res;
}
