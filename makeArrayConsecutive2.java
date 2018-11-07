int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int m=0;
    for(int i=1;i<statues.length;i++)
        m=m+statues[i]-statues[i-1]-1;
    return m;
}
