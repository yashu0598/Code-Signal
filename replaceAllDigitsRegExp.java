String replaceAllDigitsRegExp(String input) {
    for(int i=0;i<=9;i++)
        input=input.replace(""+i,"#");
    return input;
}
