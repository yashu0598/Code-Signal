int[] directionOfReading(int[] numbers) {
    int a[]=new int[numbers.length];
    for(int i=numbers.length-1;i>=0;i--)
    {
        for(int j=0;j<numbers.length;j++)
        {
            a[i]=a[i]*10+numbers[j]%10;
            numbers[j]=numbers[j]/10;
        }
    }
    return a;
}
