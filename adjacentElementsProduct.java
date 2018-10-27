/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
*/
int adjacentElementsProduct(int[] inputArray) {
    int max=Integer.MIN_VALUE;
    for(int i=1;i<inputArray.length;i++)              
        if(max<inputArray[i]*inputArray[i-1])
        max=inputArray[i]*inputArray[i-1];
return max;
}
