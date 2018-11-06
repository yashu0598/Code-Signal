int deleteDigit(int n) {
     int m = 0;
    for(int d = 1;d <= n; d*=10)
        m = Math.max(m, ((n/d)/10)*d + n%d);
    return m;
}
