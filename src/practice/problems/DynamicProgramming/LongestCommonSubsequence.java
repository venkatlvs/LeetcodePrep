package practice.problems.DynamicProgramming;

public class LongestCommonSubsequence {

    public void executeLongestCommonSubsequence(){
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("The input strings are: String 1= "+text1+" and String 2= "+text2);
        System.out.println("The output is: "+longestCommonSubsequence(text1,text2));
    }

    private static int longestCommonSubsequence(String text1, String text2){
        int m = text1.length();
        int n = text2.length();
        int[][]dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            char a = text1.charAt(i-1);
            for(int j=1;j<=n;j++){
                char b = text2.charAt(j-1);
                if(a==b) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

}
