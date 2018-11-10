boolean isBeautifulString(String inputString) {
    int a[]=new int[26];
    for(char c:inputString.toCharArray())
        a[c-'a']++;
    for(int i=0;i<25;i++)
        if(a[i]<a[i+1])
            return false;
    return true;
}
