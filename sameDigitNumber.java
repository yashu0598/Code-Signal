/*
Given an integer, check that all the digits in the number are the same.

Example

For n = 1111, the output should be
sameDigitNumber(n) = true;
For n = 1122, the output should be
sameDigitNumber(n) = false.

*/

boolean sameDigitNumber(int n) {
    String s=""+n;
    s=s.replace(""+s.charAt(0),"");
    return s.length()==0;
}
