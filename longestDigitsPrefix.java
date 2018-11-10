String longestDigitsPrefix(String inputString) {
    for(int i=0;i<inputString.length();i++)
    {
        if(!Character.isDigit(inputString.charAt(i)))
            return inputString.substring(0,i);
    }
    return inputString;
}
