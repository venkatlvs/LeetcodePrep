package practice.problems.Arrays;

import practice.utility.Helper;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TrappingRainWater {

    public void executeTrappingRainWater(){
        int[] level = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The input is: ");
        Helper.printArray(level);
        System.out.println("The output is: "+trapWater(level));
    }

    private static int trapWater(int[] height){
        int result =0;
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = height[0];
        for(int i=1;i<len;i++) left[i] = Math.max(left[i-1],height[i]);
        right[len-1] = height[len-1];
        for(int i = len-2;i>=0;i--) right[i] = Math.max(right[i+1],height[i]);
        for(int i=0;i<len;i++) result += Math.min(left[i],right[i])-height[i];
        return result;

        /*
        int result =0;
        int length = height.length;
        for(int i = 1; i< length -1; i++){
            int left = height[i];
            for(int j=0;j<i;j++){
                left= Math.max(left,height[j]);
            }
            int right = height[i];
            for(int j = length-1; j> i; j--){
                right = Math.max(right,height[j]);
            }
            result+=Math.min(right,left)-height[i];
        }
        return result;
        */
    }

}
