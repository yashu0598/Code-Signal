/*
Given a number of the pages in some book find the number of digits one needs to print to enumerate the pages of the book.

Example

For n = 11, the output should be
pagesNumbering(n) = 13.
*/


int pagesNumbering(int n) {
        int count=n;
    for(int i=1;i*9<n;i=Integer.parseInt(""+i+"1"))
        count=count+(n-i*9);
    
    return count;

}
