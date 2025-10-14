package practice.utility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Helper {

    public static void printArray(int[] arr){
        String result = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(result);
    }

    public static void printStringArray(String[] arr){
        String result = Arrays.stream(arr)
                .collect(Collectors.joining(", ", "", "."));
        System.out.println(result);
    }
}
