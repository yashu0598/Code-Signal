int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    int c=0,s=0;
    while(desiredHeight>=s)
    {
        if(s+upSpeed>=desiredHeight)return c+1;
        s=s+upSpeed-downSpeed;
        c++;
    }
    return c;
}
