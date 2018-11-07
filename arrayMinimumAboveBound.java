int arrayMinimumAboveBound(int[] inputArray, int bound) {
    Arrays.sort(inputArray);
    for(int i=0;i<inputArray.length;i++)
        if(inputArray[i]>bound)
            return inputArray[i];
    return 0;
}
