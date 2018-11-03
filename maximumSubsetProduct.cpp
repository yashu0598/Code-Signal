int maximumSubsetProduct(std::vector<int> a) {
    int mnn = -1111111111;
    int cnt = 0;
    for(int i=0;i<a.size();++i)
    {
        if(a[i] > 0)
            continue;
        mnn = max(mnn , a[i]);
        cnt++;
    }
    if(cnt % 2 == 0 || a.size() == 1)
        return 1;
    return mnn;
}
