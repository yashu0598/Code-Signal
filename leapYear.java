/*
Determine if a given year is leap or not.

Example

For year = 2000, the output should be
leapYear(year) = true.

2000 is divisible by 400, so the answer is yes.
*/

boolean leapYear(int year) {
    if(year%400==0)
           return true;   
    if(year%100!=0&&year%4==0)
            return true;
    return false;
}
