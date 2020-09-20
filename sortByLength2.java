String[] sortByLength(String[] inputArray) {
    Arrays.sort(inputArray, (a, b) -> a.length() - b.length());
    return inputArray;
}
