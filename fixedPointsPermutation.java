int fixedPointsPermutation(int[] p) {
    int c=0;
    for(int i=0;i<p.length;i++){
        if(i+1==p[i])
            c++;
    }
    return c;
}
