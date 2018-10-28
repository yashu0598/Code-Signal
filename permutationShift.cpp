/*
Define the permutation element shift as the difference between the element's value and its index. For example, for permutation [1, 0, 2, 3] of array [0, 1, 2, 3] shifts for the respective elements are [1, -1, 0, 0].

Define the permutation shift as the difference between the maximal and the minimal element shifts among all of the permutation elements.

Given a permutation of integers from 0 to n - 1 for some integer n, find its shift.

Example

For permutation = [1, 0, 2, 3], the output should be
permutationShift(permutation) = 2.
*/

int permutationShift(std::vector<int> v) {
    int n{static_cast<int>(v.size())};
    int min_shift{100};
    int max_shift{-100};
    for (int i = 0; i < n; ++i) {
        min_shift = min(min_shift, v[i] - (i + 1));
        max_shift = max(max_shift, v[i] - (i + 1));
    }
    return max_shift - min_shift;
}
