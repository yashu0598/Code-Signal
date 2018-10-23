"""
We need a function that calculates the number of Sundays after a specific day for a given period.

Example

For n = 9 and startDay = "Saturday", the output should be
howManySundays(n, startDay) = 2;
For n = 7 and startDay = "Sunday", the output should be
howManySundays(n, startDay) = 1.
"""

def howManySundays(n, startDay):
    days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    
    cur_day = days.index(startDay)
    
    q = 0
    
    for i in range(n):
        cur_day += 1
        cur_day %= 7
        if cur_day == 6:
            q += 1
            
    return q
