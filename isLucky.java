boolean isLucky(int n) {
    int s=0;
    String a=""+n;
    for(int i=0;i<a.length();i++)
        s+=(i<a.length()/2)?(a.charAt(i)-'0'):-(a.charAt(i)-'0');
    return s==0;
}
