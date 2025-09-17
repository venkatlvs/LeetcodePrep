package practice.problems.Arrays;

import practice.utility.Helper;

public class MedianOf2SortedArrays {
    public void executeMedianOf2SortedArrays() {
        int[] nums1 = new int[]{1,3,5,6};
        System.out.println("The given Array is: ");
        Helper.printArray(nums1);
        int[] nums2 = new int[]{2,4};
        Helper.printArray(nums2);
        System.out.println("The output of the code is: " + medianOf2SortedArrays(nums1, nums2));
    }

    private double medianOf2SortedArrays(int[] arr1, int[] arr2){
        int M = arr1.length;
        int N = arr2.length;
        int i=0, j=0, k = 0;
        int[] res = new int[M+N];
        while(i<M && j<N){
            if(arr1[i] <= arr2[j]){
                res[k++]= arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }
        while (i<M) res[k++] = arr1[i++];
        while (j<N) res[k++] = arr2[j++];
        if(k%2 ==1){
            return res[k/2];
        }else{
            return (res[k/2-1]+res[k/2])/2.0;
        }

    }
}
