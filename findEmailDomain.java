String findEmailDomain(String address) {
    String s="";
    for(int i=address.length()-1;i>=0;i--)
    {
        if(address.charAt(i)=='@')
            break;
        s=address.charAt(i)+s;
    }
    return s;
}
