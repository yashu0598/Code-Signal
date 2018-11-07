int sumOfMultiples(int n, int k) {
    int s=0;
    for(int i=1;i*k<=n;i++)
        s=s+i*k;
    return s;
}
