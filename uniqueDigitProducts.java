int uniqueDigitProducts(int[] a) {
    Set<Integer> a1=new HashSet<>();
    for(int i=0;i<a.length;i++)
    {
        int n=a[i];
        int s=1;
        while(n>0)
        {
            s*=n%10;
            n=n/10;
        }
        a1.add(s);
    }
    return a1.size();
}
