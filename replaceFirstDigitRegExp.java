String replaceFirstDigitRegExp(String input) {
    String s="";
    boolean f=true;
    for(char c:input.toCharArray())
    {
        if(f&&Character.isDigit(c))
        {
            f=!f;
            s=s+"#";
        }
        else
            s=s+c;
    }
    return s;
}
