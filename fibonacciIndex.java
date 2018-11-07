int fibonacciIndex(int n) {
    if(n==1)
        return 0;
    int c=1,k=0,a=0,b=1;
    while((""+c).length()!=n)
    {
        c=a+b;
        a=b;
        b=c;
        k++;
    }
    return k+1;
}
