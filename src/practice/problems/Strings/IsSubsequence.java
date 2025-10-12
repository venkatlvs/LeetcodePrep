package practice.problems.Strings;

public class IsSubsequence {

    public void executeIsSubsequence(){
        String s = "abc";
        String t = "ayturvbiueuyc";
        System.out.println("The given strings are: "+ s+ "and "+t);
        System.out.println("The output is: "+isSubsequence(s,t));
    }
    private boolean isSubsequence(String s, String t){
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;j++;
            j++;
        }
        return i==s.length();
    }
}
