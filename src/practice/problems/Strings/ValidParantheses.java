package practice.problems.Strings;

import java.util.Stack;

public class ValidParantheses {
    public void executeValidParantheses(){
        String parantheses = "()[]{}";
        System.out.println("The input string is: "+ parantheses);
        System.out.println("The output is: "+validParantheses(parantheses));
    }

    private boolean validParantheses(String parantheses){
        Stack<Character> s = new Stack<>();
        for(char c: parantheses.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                s.push(c);
                continue;
            }
            if(s.isEmpty()){
                return false;
            }
            if((s.peek() == '[' && c==']') ||(s.peek() == '{' && c=='}') ||(s.peek() == '(' && c==')')){
                s.pop();
            }else{
                return false;
            }
        }
        return s.isEmpty();
    }


}
