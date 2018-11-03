int arrayMinimumIndex(int[] inputArray) {
    int min=0;
    for(int i=1;i<inputArray.length;i++)
        if(inputArray[i]<inputArray[min])
            min=i;
    return min;
}
