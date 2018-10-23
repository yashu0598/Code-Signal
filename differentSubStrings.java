/*
Given a string, find the number of different non-empty substrings in it.

Example

For inputString = "abac", the output should be
differentSubstrings(inputString) = 9.
They are:

"a", "b", "c",
"ab", ac", "ba",
"aba", "bac",
"abac"
*/

int differentSubstrings(String inputString) {
    Set<String> s=new HashSet<>();
    for(int i=0;i<inputString.length();i++)
        for(int j=i;j<inputString.length();j++)
            s.add(inputString.substring(i,j+1));
    return s.size();
}
