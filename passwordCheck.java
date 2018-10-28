boolean passwordCheck(String inputString) {
 if(inputString.length()<5)
        return false;
    boolean bi=false,bj=false,bk=false;
    for(char i :inputString.toCharArray())
    {
        if(i>='a' && i<='z')
            bi=true;
        else if(i>='A' && i<='Z')
            bj=true;
        else if (i>='0' && i<='9')
            bk=true;
    }
    return bi && bj && bk;    
}
