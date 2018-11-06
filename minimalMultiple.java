int minimalMultiple(int divisor, int lowerBound) {
    for(int i=lowerBound;;i++)
        if(i%divisor==0)
            return i;
}
