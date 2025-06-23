package practice.problems.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public void executeIsomorphicStrings(){
    String a = "abb";
    String b = "cxx";
        System.out.println("The given strings are: "+a+" and "+ b);
        System.out.println("The output of the code is: "+ isIsomorphic(a,b));
    }

    private boolean isIsomorphic(String a, String b) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        if(a.length()!=b.length()){
           return false;
        }
        for(int i=0;i<a.length();i++){
            m1.putIfAbsent(a.charAt(i),i);
            m2.putIfAbsent(b.charAt(i),i);
            if(!m1.get(a.charAt(i)).equals(m2.get(b.charAt(i)))){
                return false;
            }
        }
        return true;
    }


}
