package practice.problems.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public void executeFibonacciSeries(){
        int n = 10;
        List<Integer> lst = new ArrayList<>();
        for(int i =0; i<n;i++){
            lst.add(fibonacciSeriesMemoApproach(i));
        }
        System.out.println("Output: "+lst);
    }

    private int fibonacciSeriesMemoApproach(int num){
        if(num<=1){
            return num;
        }
        return fibonacciSeriesMemoApproach(num-1)+fibonacciSeriesMemoApproach(num-2);
    }
}
