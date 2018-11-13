int divNumber(int k, int l, int r) {
int c=0;
    for(int i=l;i<=r;i++)
    {
        int c1=1;
        for(int j=1;j<=i/2;j++)
            if(i%j==0)
                c1++;
        if(c1==k)
            c++;
    }
    return c;
}
