package practice.problems.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInaString {

    public void executeFirstUniqueCharacterInaString(){
        String a = "leetcode";
        System.out.println("The given string is: "+ a);
        System.out.println("The output of the code is: "+ firstUniqueCharacterinaString(a));
    }
    private int firstUniqueCharacterinaString(String s){
        Map<Character, Integer> fMap = new HashMap<>();
        for(char c: s.toCharArray()){
            fMap.put(c,fMap.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<s.length();i++){
            if(fMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
