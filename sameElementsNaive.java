/*
Find the number of elements that are contained in both of the given arrays.

Example

For a = [1, 2, 3] and b = [3, 4, 5], the output should be
sameElementsNaive(a, b) = 1.

Input/Output
*/

int sameElementsNaive(int[] a, int[] b) {
    int c=0;
    for(int i=0;i<a.length;i++)
        for(int j=0;j<b.length;j++)
            if(a[i]==b[j])
                c++;
    return c;
}
