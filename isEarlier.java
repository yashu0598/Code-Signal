/*

Given timestamps time1 and time2, return true if time1 is strictly earlier than time2 and false otherwise.

Example

For time1 = [22, 30] and time2 = [10, 59], the output should be
isEarlier(time1, time2) = false;
For time1 = [0, 5] and time2 = [1, 0], the output should be
isEarlier(time1, time2) = true.
*/

boolean isEarlier(int[] time1, int[] time2) {
    if(time1[0]<time2[0])
        return true;
    else if(time1[0]>time2[0])
        return false;
    else
    {
        if(time1[1]<time2[1])return true;
        else if(time1[1]>=time2[1])return false;
        
    }
    return false;
}
