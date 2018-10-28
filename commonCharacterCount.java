/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

*/

int commonCharacterCount(String s1, String s2) {
    int[] a = new int[26];
    int[] b = new int[26];
    for (char c: s1.toCharArray())
        a[c - 'a']++;
    for (char c: s2.toCharArray())
        b[c - 'a']++;
    int s = 0;
    for (int i = 0; i < 26; ++i) 
        s +=Math.min(a[i],b[i]);
    return s;   
}
