/*

Given a rectangular matrix consisting of zeroes, replace each zero with the number of neighboring cells for that cell.

Example

For

matrix = [[0, 0, 0],
          [0, 0, 0],
          [0, 0, 0]]
the output should be

neighboringCells(matrix) = [[2, 3, 2],
                            [3, 4, 3],
                            [2, 3, 2]]

*/
std::vector<std::vector<int>> neighboringCells(std::vector<std::vector<int>> matrix) {
    int n{static_cast<int>(matrix.size())};
    int m{static_cast<int>(matrix[0].size())};
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            if (matrix[i][j] == 0) {
                int cnt{0};
                const vector<pair<int, int>> dir{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
                for (const auto& d : dir) {
                    int ii{i + d.first};
                    int jj{j + d.second};
                    if (ii >= 0 && ii < n && jj >= 0 && jj < m) {
                        ++cnt;
                    }
                }
                matrix[i][j] = cnt;
            }
        }
    }
    return matrix;
}

