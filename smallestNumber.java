int smallestNumber(int n) {
    String s="1";
    if(n==1)return 0;
    for(int i=0;i<n-1;i++)
        s=s+"0";
    return Integer.parseInt(s);
}
