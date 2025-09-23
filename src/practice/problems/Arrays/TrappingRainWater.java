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
        int length = height.length;
        for(int i = 1; i< length -1; i++){
            int left = height[i];
            for(int j=0;j<i;j++){
                left= Math.max(left,height[j]);
            }
            int right = height[i];
            for(int j = i+1; j< length; j++){
                right = Math.max(right,height[j]);
            }
            result+=Math.min(right,left)-height[i];
        }
        return result;
    }

}
