/*
Map the given integer to a month.

Example

For mo = 1, the output should be
getMonthName(mo) = "Jan";
For mo = 0, the output should be
getMonthName(mo) = "invalid month".
*/

String getMonthName(int mo) {
String m[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    if(mo<1||mo>12)
        return "invalid month";
    return m[mo-1];
}
