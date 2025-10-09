package practice.problems.Arrays;

import practice.utility.Helper;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public void executeTwoSum() {
        int[] arr = new int[]{2,5,4,3};
        System.out.println("The input arr is: ");
        Helper.printArray(arr);
        System.out.println("The out of 2 sum is: ");
        Helper.printArray(twoSum(arr, 7));
    }

    private int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int c = target - arr[i];
            if(m.containsKey(c)) return new int[]{m.get(c),i};
            m.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

}
