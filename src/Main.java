import practice.problems.Arrays.MaximumSubarray;
import practice.problems.Arrays.MedianOf2SortedArrays;
import practice.problems.DynamicProgramming.FibonacciSeries;
import practice.problems.DynamicProgramming.LongestCommonSubsequence;
import practice.problems.Graphs.BreadthFirstApproach;
import practice.problems.Graphs.DepthFirstApproach;
import practice.problems.Sorting.MajorityElement;
import practice.problems.Strings.FirstUniqueCharacterInaString;
import practice.problems.Strings.IsomorphicStrings;
import practice.problems.Strings.LongestNonRepeatingSubstring;

public class Main {
    public static void main(String[] args) {

        System.out.println("MaximumSubarray:");
        MaximumSubarray max = new MaximumSubarray();
        max.executeMaximumSubarray();
        System.out.println("=======================");
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
        System.out.println("=======================");
        System.out.println("MajorityElement:");
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.executeMajorityElement();
        System.out.println("=======================");
        MedianOf2SortedArrays medianOf2SortedArrays = new MedianOf2SortedArrays();
        medianOf2SortedArrays.executeMedianOf2SortedArrays();
        System.out.println("=======================");
        BreadthFirstApproach bfs = new BreadthFirstApproach();
        bfs.executeBreadthFirstApproach();
        System.out.println("=======================");
        DepthFirstApproach dfs = new DepthFirstApproach();
        dfs.executeDepthFirstApproach();
        System.out.println("=======================");
        FibonacciSeries series = new FibonacciSeries();
        series.executeFibonacciSeries();
        System.out.println("=======================");
        LongestCommonSubsequence subsequence = new LongestCommonSubsequence();
        subsequence.executeLongestCommonSubsequence();

    }
}