package practice.problems.Arrays;

import static practice.utility.Helper.printArray;

public class BestTimetoBuyandSellStock {

    public void executeBestTimetoBuyandSellStock(){
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println("The given array is: ");
        printArray(prices);
        System.out.println("The best time to Buy and Sell stock is: "+bestTimeToBuyAndSellStock(prices));
    }

    private int bestTimeToBuyAndSellStock(int[] prices){
        int c = prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            c = Math.min(c,prices[i]);
            int profit = prices[i] - c;
            max = Math.max(max,profit);
        }
        return max;
    }

}
