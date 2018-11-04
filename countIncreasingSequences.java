int countIncreasingSequences(int n, int k) {
if (n == 0 || n == k)
			return 1;
		if (n == 1 || n == k - 1)
			return k;
		return countIncreasingSequences(n - 1, k - 1) + countIncreasingSequences(n, k - 1);
}
