package practice.problems.DynamicProgramming;

public class ClimbingStairs {

    public void executeClimbingStairs(){
        int stairs = 10;
        System.out.println("The input is: "+ stairs);
        System.out.println("The output is: "+climbingStairs(stairs));
    }

    int[] memo;
    private int climbingStairs(int stairs) {
        memo = new int[stairs+1];
        return solveMemo(stairs);
    }

    private int solveMemo(int n){
        if(n<=1){
            return 1;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        memo[n] = solveMemo(n-1)+solveMemo(n-2);
        return memo[n];
    }
}
