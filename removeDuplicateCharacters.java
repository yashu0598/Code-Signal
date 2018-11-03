String removeDuplicateCharacters(String str) {
    String s="";
    
for(int i=0;i<str.length();i++) 
{
    int j=0;
    for(j=0;j<str.length();j++)
    {
        if(str.charAt(i)==str.charAt(j)&&i!=j)
            break;
    }
    if(j==str.length())
        s=s+str.charAt(i);
}return s;
}
