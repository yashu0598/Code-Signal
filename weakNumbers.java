/*

We define the weakness of number x as the number of positive integers smaller than x that have more divisors than x.

It follows that the weaker the number, the greater overall weakness it has. For the given integer n, you need to answer two questions:

what is the weakness of the weakest numbers in the range [1, n]?
how many numbers in the range [1, n] have this weakness?
Return the answer as an array of two elements, where the first element is the answer to the first question, and the second element is the answer to the second question.

Example

For n = 9, the output should be
weakNumbers(n) = [2, 2].

Here are the number of divisors and the specific weakness of each number in range [1, 9]:

1: d(1) = 1, weakness(1) = 0;
2: d(2) = 2, weakness(2) = 0;
3: d(3) = 2, weakness(3) = 0;
4: d(4) = 3, weakness(4) = 0;
5: d(5) = 2, weakness(5) = 1;
6: d(6) = 4, weakness(6) = 0;
7: d(7) = 2, weakness(7) = 2;
8: d(8) = 4, weakness(8) = 0;
9: d(9) = 3, weakness(9) = 2.
As you can see, the maximal weakness is 2, and there are 2 numbers with that weakness level.

*/
int[] weakNumbers(int n) {
    List<Integer> result=new ArrayList<Integer>();
    int weaknesses = 0, weaknest=0;
    for(int index=1;index<=n;index++) {
        int w = getWeakness(index);
        if(w>weaknest) {
            weaknest = w;
            weaknesses=1;
        }
        else if(w==weaknest)
            weaknesses++;
    }
    result.add(weaknest);
    result.add(weaknesses);
    int a[]=new int[result.size()];
    for(int i=0;i<result.size();i++)
        a[i]=result.get(i);
    return a;
}
int getWeakness(int n) {
    int count=0;
    if(n==1)
        return 0;
    int dN = getD(n);
    for(int i=1;i<n;i++) {
        if(getD(i)>dN)
            count++;
    }
    return count;
}
int getD(int n) {
    if(n==1)
        return 1;
    if(n==2)
        return 2;
    int count=0;
    int halfN = n/2;
    for(int i=2;i<=halfN;i++) {
        if(n%i==0)
            count++;
    }
    return count+2;
}

