boolean isPermutation(int n, int[] a) {
    Arrays.sort(a);
    if(a[0] != 1) return false;
    for(int i = 1 ; i < a.length;i++){
        if(a[i]- 1 != a[i-1])
            return false;
    }
    return true;
}
