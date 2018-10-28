"""
Given the sequence of integers seq, check if it is strictly increasing.

Example

For seq = [1, 3, 8], the output should be
checkIncreasingSequence(seq) = true;
For seq = [2, 2, 3], the output should be
checkIncreasingSequence(seq) = false.
"""

def checkIncreasingSequence(seq):
    for i  in range(1,len(seq)):
        if seq[i]<=seq[i-1]:
            return False
    return True
