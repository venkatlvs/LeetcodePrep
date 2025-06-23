package practice.problems.array;

import static practice.utility.Helper.printArray;

public class MaximumSubarray {

    public void executeMaximumSubarray(){
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The given array is: ");
        printArray(arr);
        System.out.println("The output of the code is: "+ getMaxSubArray(arr));
    }

    private Integer getMaxSubArray(int[] arr){
        int a = arr[0];
        int b = arr[0];
        for(int i:arr){
            a = Math.max(i,a+i);
            b = Math.max(b,a);
        }
        return b;
    }
}
