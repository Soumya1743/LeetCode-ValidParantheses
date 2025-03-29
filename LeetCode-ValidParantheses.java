https://leetcode.com/problems/valid-parentheses/


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            Character counterPart = stack.pop();
            if (c == ')' && counterPart != '(') {
                return false;
            }
            if (c == ']' && counterPart != '[') {
                return false;
            }
            if (c == '}' && counterPart != '{') {
                return false;
            }
        }
        return stack.empty();
    }
}







The Stack<Character> data structure is ideal for matching opening and closing brackets, as it operates in a last-in, first-out (LIFO) manner.
The toCharArray() method converts the string into a character array for easy iteration.
