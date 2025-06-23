package practice;

import practice.problems.array.MaximumSubarray;
import practice.problems.string.FirstUniqueCharacterInaString;
import practice.problems.string.IsomorphicStrings;
import practice.problems.string.LongestNonRepeatingSubstring;

public class Main {
    public static void main(String[] args) {

        System.out.println("MaximumSubarray:");
        MaximumSubarray max = new MaximumSubarray();
        max.executeMaximumSubarray();
        System.out.println("Isomorphic Strings:");
        IsomorphicStrings is = new IsomorphicStrings();
        is.executeIsomorphicStrings();
        System.out.println("=======================");
        System.out.println("LongestNonRepeatingSubstring:");
        LongestNonRepeatingSubstring lnrs = new LongestNonRepeatingSubstring();
        lnrs.executeLongestNonRepeatingSubstring();
        System.out.println("=======================");
        System.out.println("FirstUniqueCharacterInaString:");
        FirstUniqueCharacterInaString fs = new FirstUniqueCharacterInaString();
        fs.executeFirstUniqueCharacterInaString();

    }
}