package practice.problems.Strings;

import practice.utility.Helper;

import java.util.Arrays;

public class LongestCommonPrefix {
    public void executeLongestCommonPrefix(){
        String[] arr = {"bat", "ball", "bag", "bug"};
        System.out.println("The input strings are: ");
        Helper.printStringArray(arr);
        System.out.println("The output of the codeis: "+ longestCommonPrefix(arr));
    }

    private String longestCommonPrefix(String[] arr){
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        String first = arr[0], second = arr[arr.length-1];
        int min = Math.min(first.length(),second.length());
        int i=0;
        while(i<min && first.charAt(i)==second.charAt(i)){
            i++;
        }
        return arr[0].substring(0,i);
    }

}
