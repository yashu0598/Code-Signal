int kthDigit(int n, int k) {
    if(k>(""+n).length())
        return -1;
    return (""+n).charAt(k-1)-'0';
}
