/*
Transform a given sentence into a new one with dashes between each two consecutive letters.

Example

For inputString = "aba caba", the output should be
insertDashes(inputString) = "a-b-a c-a-b-a".
*/


String insertDashes(String inputString) {
    String s="";
    for(int i=0;i<inputString.length()-1;i++)
    {
        if(inputString.charAt(i+1)==' ')
        {
             s=s+inputString.charAt(i)+" ";
            i++;
        }
        else
            s=s+inputString.charAt(i)+"-";
    }
    return s+inputString.charAt(inputString.length()-1);
}
