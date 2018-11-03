/*
Given a positive integer number and a certain length, we need to modify the given number to have a specified length. We are allowed to do that either by cutting out leading digits (if the number needs to be shortened) or by adding 0s in front of the original number.

Example

For number = 1234 and width = 2, the output should be
integerToStringOfFixedWidth(number, width) = "34";
For number = 1234 and width = 4, the output should be
integerToStringOfFixedWidth(number, width) = "1234";
For number = 1234 and width = 5, the output should be
integerToStringOfFixedWidth(number, width) = "01234".
*/
String integerToStringOfFixedWidth(int number, int width) {
    String s=""+number;
    if(s.length()>=width)
        return s.substring(s.length()-width,s.length());
    String s1=s;
    for(int i=0;i<width-s1.length();i++)
        s="0"+s;
    return s;
}
