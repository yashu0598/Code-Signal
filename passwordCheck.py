"""
A password is complex enough, if it meets all of the following conditions:

its length is at least 5 characters;
it contains at least one capital letter;
it contains at least one small letter;
it contains at least one digit.
Determine whether a given password is complex enough.

Example

For inputString = "my.Password123", the output should be
passwordCheck(inputString) = true;
For inputString = "my.password123", the output should be
passwordCheck(inputString) = false.
"""

def passwordCheck(inputString):
    if len(inputString)<5:
        return False
    bi=False
    bj=False
    bk=False
    for i in inputString:
        if i>='a' and i<='z':
            bi=True
        elif i>='A' and i<='Z':
            bj=True
        elif i>='0' and i<='9':
            bk=True
    return bi and bj and bk     
            
