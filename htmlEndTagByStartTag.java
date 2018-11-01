String htmlEndTagByStartTag(String startTag) {
    String s="</";
    for(int i=startTag.indexOf('<')+1;i<startTag.length();i++)
    {
        if(startTag.charAt(i)==' ')
            break;
        s=s+startTag.charAt(i);
    }
    if(s.charAt(s.length()-1)=='>')
    return s;
    return s+">";
}
