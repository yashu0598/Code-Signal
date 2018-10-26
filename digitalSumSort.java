/*
You are given an array of integers. Sort it in such a way that if a comes before b then the sum of digits of a is less than or equal to the sum of digits of b. If two numbers have the same sum of digits, the smaller one (in the regular sense) should come first. For example 4 and 13 have the same sum of digits, however 4 < 13 thus 4 comes before 13 in any digitalSum sorting where both are present.

Example

For a = [13, 20, 7, 4], the output should be
digitalSumSort(a) = [20, 4, 13, 7].
*/

int[] digitalSumSort(int[] a) {
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
        int n=a[i];
        while(n>0)
        {
            b[i]+=n%10;
            n=n/10;        
        }
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(b[i]>b[j])
            {
                
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                t=b[i];
                b[i]=b[j];
                b[j]=t;
            }
            else if(b[i]==b[j])
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                a[i]=a[j];
                a[j]=t;
                t=b[i];
                b[i]=b[j];
                b[j]=t;
                }
            }
        }
    }
        return a;
}
