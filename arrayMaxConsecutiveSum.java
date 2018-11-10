int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int m=0;
    for(int i=0;i<=inputArray.length-k;i++)
    {
        int s=0;
        for(int j=i;j<i+k;j++)
            s=s+inputArray[j];
        if(s>m)
            m=s;
    }
    return m;
}
