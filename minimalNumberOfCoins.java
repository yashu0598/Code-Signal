int minimalNumberOfCoins(int[] coins, int price) {
        Arrays.sort(coins);
        int c=0;
        for(int i=coins.length-1;i>=0;i--)
        {
                c+=price/coins[i];
           price=price-(price/coins[i])*coins[i];
                if(price<=0)
                        break;
           
        }
        return c;
}
