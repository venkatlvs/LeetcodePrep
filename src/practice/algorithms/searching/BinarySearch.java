package practice.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,6,8};
        System.out.println(new BinarySearch().executeBinarySearchForIntegers(arr,3));
    }

    private int executeBinarySearchForIntegers(int[] arr, int target){
        Arrays.sort(arr);
        int left =0, right = arr.length-1;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>=target) {
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;

    }
}
