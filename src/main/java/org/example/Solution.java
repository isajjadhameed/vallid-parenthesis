package org.example;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        isValid("{([])}");
    }
        public static boolean isValid(String s) {


            Stack<Character> stack = new Stack();

            for(char c: s.toCharArray()){
                if(stack.isEmpty()){
                    stack.push(c);
                }

                else if((stack.peek() == '(' && c == ')') ||
                        (stack.peek() == '[' && c == ']') ||
                        (stack.peek() == '{' && c == '}')){
                    stack.pop();
                }
                else{
                    stack.push(c);
                }

            }

            if(stack.size()==0)
                return true;

            return false;
        }

}
