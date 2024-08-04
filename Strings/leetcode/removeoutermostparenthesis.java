package Strings.leetcode;

import java.util.Stack;

public class removeoutermostparenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (stack.size() == 0) {
                    stack.push(s.charAt(i));
                } else if(stack.size() > 0){
                    stack.push(s.charAt(i));
                    sb.append(s.charAt(i));
                }
            }
            if (s.charAt(i) == ')') {
                if(stack.size() == 1){
                    stack.pop();
                } else if (stack.size() > 1) {
                    stack.pop();
                    sb.append(s.charAt(i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
}
