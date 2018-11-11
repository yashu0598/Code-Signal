int fibonacciNumber(int n) {
    if(n==0)return 0;
    if(n==1)
        return 1;
    int c=1,k=1,a=0,b=1;
    while(k!=n)
    {
        c=a+b;
        a=b;
        b=c;
        k++;
    }
    return c;
}
