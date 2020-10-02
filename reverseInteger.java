int reverseInteger(int x) {
    int a=x;
    if(x<0) a=-x;
    String b=(new StringBuffer(""+a)).reverse().toString();
    if(x<0) b="-"+b;
    return Integer.parseInt(b);
}
