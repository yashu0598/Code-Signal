int digitDegree(int n) {
    int c=0;
    while(n/10!=0)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        n=s;
        c++;
    }
    return c;
}
