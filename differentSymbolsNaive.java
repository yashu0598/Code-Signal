int differentSymbolsNaive(String s) {
    Set<Character> a=new HashSet<>();
    for(char c:s.toCharArray())
        a.add(c);
    return a.size();
}
