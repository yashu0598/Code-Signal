int[] alternatingSums(int[] a) {
    int b[]=new int[2];
    for(int i=0;i<a.length;i++)
        b[i%2]+=a[i];
    return b;
}
