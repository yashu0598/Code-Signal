int depositProfit(int deposit, int rate, int threshold) {
    double p=deposit;
   int c=0;
    while(threshold>(int)p)
    {
        c++;
        p=p*(100+rate)/100;
    }
    return c;
}
