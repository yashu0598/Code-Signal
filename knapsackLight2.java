String knapsackLight2(int w1, int w2, int m) {
    if(w1+w2<=m) return "both";
    if(w1<=m &&w2<=m) return "either";
    if(w1>m && w2>m) return "none";
    if(w1<=m) return "first";
    return "second";
}
