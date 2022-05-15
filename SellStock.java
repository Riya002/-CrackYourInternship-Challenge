package Arrays;

public class SellStock {
    public static void main(String[] args) {
            int []prices={7,1,5,3,6,4};
        System.out.println(optimise_maxproit(prices));
    }
    public static int maxProfit(int[] prices) {
        int diff=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[j]>prices[i])
                {
                    diff=Math.max(prices[j]-prices[i],diff);
                }
            }
        }
        return diff;
    }
    public static int optimise_maxproit(int[]prices)
    {
        //o(n)
        int leastprofit= Integer.MAX_VALUE;
        int overallprofit= 0;
        int currprofit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < leastprofit){
                leastprofit = prices[i];
            }
            currprofit = prices[i] - leastprofit;
            if(overallprofit < currprofit){
                overallprofit = currprofit;
            }
        }
        return overallprofit;
    }
}
