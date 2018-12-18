String caseUnification(String inputString) {
    int u=0,l=0;
    for(int i=0;i<inputString.length();i++)
    {
        char c=inputString.charAt(i);
        if(c>=65&&c<=91)
            u++;
        else
            l++;
    }
    if(u>l)
        return inputString.toUpperCase();
    return inputString.toLowerCase();
}
