package practice.problems.DynamicProgramming;

import practice.utility.Helper;

public class CoinChange {
    public void executeCoinChange(){
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        System.out.println("The coins are: ");
        Helper.printArray(coins);
        System.out.println("and the amount to be formed is: "+amount);
        System.out.println("The output is: "+coinChange(coins, amount));

    }

    private int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0]=0;
        for(int j=1;j<amount+1;j++){
            dp[j] = Integer.MAX_VALUE;
        }
        for(int coin: coins){
            for(int j=coin;j<amount+1;j++){
                if(coin<=j){
                    int include = dp[j-coin]!= Integer.MAX_VALUE?1+dp[j-coin]:Integer.MAX_VALUE;
                    int exclude = dp[j];
                    dp[j] = Math.min(include,exclude);
                }else{
                    int exclude = dp[j];
                    dp[j] = exclude;
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }

}
