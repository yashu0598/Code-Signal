int arraySumAdjacentDifference(int[] inputArray) {
    int m=0;
    for(int i=0;i<inputArray.length-abs;i++)
        m+=Math.abs(inputArray[i]-inputArray[i+1]);
    return m;
}
