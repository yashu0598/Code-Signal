/*
Given a number of the pages in some book find the number of digits one needs to print to enumerate the pages of the book.

Example

For n = 11, the output should be
pagesNumbering(n) = 13.
*/



int pagesNumbering(int n) {
    int count=0;
    count = n;
    if(n>9){
        count=count+(n-9);
    }
    if(n>99) {
        count=count+(n-99);
    }
    if(n>999){
        count=count+(n-999);
    }
    if(n>9999){
        count=count+(n-9999);
    }
    if(n>99999){
        count=count+(n-99999);
    }
    if(n>999999){
        count=count+(n-999999);
    }
    if(n>9999999){
        count=count+(n-9999999);
    }
    if(n>99999999){
        count=count+(n-99999999);
    }
    
    return count;
}

