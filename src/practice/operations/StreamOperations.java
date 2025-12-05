package practice.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperations {
    /*
    Find even numbers and sort

Given List<Integer> nums, return a sorted List<Integer> of distinct even numbers.
     */
    public static void main(String[] args) {
        int[] arr = new int[]{54,77,89,34,56,73};
        new StreamOperations().evenNumbersAndSort(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    void evenNumbersAndSort(List<Integer> nums){
        System.out.println(nums.stream().filter(a-> (a%2==0)).sorted().toList());
    }
}
