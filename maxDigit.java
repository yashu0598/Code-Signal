int maxDigit(int n) {
    int m=0;
    for(char c:(""+n).toCharArray())
    {
        if((c-'0')>m)
            m=c-'0';
    }
    return m;
}

