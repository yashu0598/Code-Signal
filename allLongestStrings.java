String[] allLongestStrings(String[] inputArray) {
 int mL = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (mL < inputArray[i].length())
            mL = inputArray[i].length();
    }
    
    final int longest = mL;
    return Stream.of(inputArray)
        .filter(s -> s.length() == longest)
        .toArray(String[]::new);
}
