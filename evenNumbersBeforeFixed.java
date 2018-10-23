/*
Given array of integers sequence and some integer fixedElement, output the number of even values in sequence before the first occurrence of fixedElement or -1 if fixedElement is not contained in sequence.

Example

For sequence = [1, 4, 2, 6, 3, 1] and fixedElement = 6, the output should be
evenNumbersBeforeFixed(sequence, fixedElement) = 2.
*/


int evenNumbersBeforeFixed(int[] sequence, int fixedElement) {
    
    int c=0;
    for(int i=0;i<sequence.length;i++)
    {
         if(fixedElement==sequence[i])
            return c;
        if(sequence[i]%2==0)
            c++;
       
    }
return -1;
}
