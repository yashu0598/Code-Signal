"""
Return a strictly increasing array of all even numbers between given left and right (both inclusive).

Example

For left = 5 and right = 10, the output should be
onlyEvenNumbers(left, right) = [6, 8, 10].
"""

def onlyEvenNumbers(left, right):
    a=[]
    for i in range(left,right+1):
        if i%2==0:
            a.append(i)
    return a
