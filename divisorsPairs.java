/*
Given array of integers, find the number of sorted pairs formed by its (different) elements such that the second element in the pair is divisible by the first one.

Example

For sequence = [1, 3, 2], the output should be
divisorsPairs(sequence) = 2.

These pairs are: (1, 3), (1, 2).

For sequence = [2, 4, 8], the output should be
divisorsPairs(sequence) = 3.

These pairs are: (2, 4), (2, 8), (4, 8).
*/


int divisorsPairs(int[] sequence) {
    int c=0;
    for(int i=0;i<sequence.length;i++)
    {
        for(int j=i+1;j<sequence.length;j++)
        {
            if(sequence[i]%sequence[j]==0||sequence[j]%sequence[i]==0)
                c++;
        }
    }
    return c;
}
