int countNeighbouringPairs(String inputString) {
    int c=0;
    for(int i=1;i<inputString.length();i++)
    {
        if(inputString.charAt(i)==inputString.charAt(i-1))
            c++;
    }
    return c;
}
