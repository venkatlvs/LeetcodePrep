package practice.problems.Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {

    public void executeLongestNonRepeatingSubstring() {
        String a = "abcabcdfabu";
        System.out.println("The given strings are: "+a);
        System.out.println("The output of the code is: "+ longestNonRepeatingSubstring(a));
    }

    private Integer longestNonRepeatingSubstring(String s){
        Set<Character> c = new HashSet<>();
        int max = 0;
        int left = 0;
        int start =0;
        for(int right = 0;right<s.length();right++){
            while(!c.add(s.charAt(right))){
                c.remove(s.charAt(left++));
            }
            max =  Math.max(max, right-left+1);
            start = left;
        }
        System.out.println("The longest substring is: "+s.substring(start,start+max));
        return max;
    }
}
