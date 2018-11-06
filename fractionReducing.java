int gcd(int a,int b){
    if(a%b==0)
        return b;
    return gcd(b,a%b);
}
int[] fractionReducing(int[] fraction) {
    int g=gcd(fraction[0],fraction[1]);  
    fraction[0]/=g;
    fraction[1]/=g;
    return fraction;
}
