int differentValuesInMultiplicationTable(int n, int m) {
    Set<Integer> s=new HashSet<>();
    for(int i=1;i<=n;i++)
        for(int j=1;j<=m;j++)
            s.add(i*j);
    return s.size();
}
