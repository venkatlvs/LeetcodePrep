package practice.problems.DynamicProgramming;

import practice.utility.Helper;

public class HouseRobber {

    public void executeHouseRobber(){
        int[] houses = new int[]{1,2,3,1};
        System.out.println("The input array is: ");Helper.printArray(houses);
        System.out.println("The output is: "+houseRobber(houses));
    }

    private int houseRobber(int[] arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }else {
            int[] dp = new int[arr.length + 1];
            dp[0] = arr[0];
            dp[1]=arr[1];
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
            }
            return dp[n-1];
        }
    }
}
