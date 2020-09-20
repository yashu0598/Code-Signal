boolean tripletSum(int x, int[] a) {
    Arrays.sort(a);
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            for(int k=j+1;k<a.length;k++){
                int s=a[i]+a[j]+a[k];
                if(s==x) return true;
                if(s>x) break;
            }
        }
    }
    return false;
}
