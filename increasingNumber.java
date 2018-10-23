/*
You are given a positive integer x and you should perform n operations, where on the ith operation you increase x in such a way that its new value is divisible by i (operations are numbered from 1 to n).  Find the minimal value of x you can obtain by performing n operations described above.  Example  For x = 9 and n = 5, the output should be increasingNumber(x, n) = 15.
*/

int increasingNumber(int x, int n) {
    int ans = x;
    for (int i=1; i<=n; i++)
        if ( x % i != 0)
          x += i - x % i;
    
    return x;
}

