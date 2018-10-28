boolean chessBoardCellColor(String cell1, String cell2) {
int a = cell1.charAt(0) + cell1.charAt(1) - '1';
    int b = cell2.charAt(0) + cell2.charAt(1) - '1';
    return (a % 2) == (b % 2);
}
