int equationSolutions(int l, int r) {
    int c=0;
        for(int i=l;i<=r;i++)
    {
        for(int j=l;j<=r;j++)
            if(i*i*i==j*j)
                c++;
    }
    return c;
}
