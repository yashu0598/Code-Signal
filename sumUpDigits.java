int sumUpDigits(String inputString) {
    int s=0;
    for(char c:inputString.toCharArray())
        if(Character.isDigit(c))
            s=s+c-48;
    return s;
}
