int knapsackLight(int v1, int w1, int v2, int w2, int mW) {
    return w1 + w2 <= mW? v1 + v2: v1 > v2 && w1 <= mW? v1: w2 <= mW? v2: w1 <= mW? v1: 0; 
}

