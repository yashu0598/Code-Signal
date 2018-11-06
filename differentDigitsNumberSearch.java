int differentDigitsNumberSearch(int[] inputArray) {
    for(int a:inputArray)
    {
        int n=a;
        Set<Integer> s=new HashSet<>();
        while(a>0)
        {
            s.add(a%10);
            a=a/10;
        }
        if(s.size()==(""+n).length())
            return n;
    }
    return -1;
}
