// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

class Solution {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public boolean isValid(String s) {

        // Initialize hashmap to add opening and closing brackets for keys and values respectively
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        // Initialize Stack to add in and keep track of brackets
        Stack<Character> stack = new Stack<>();

        // Convert String to a char array
        char[] c = s.toCharArray();

        // Iterate through loop
        for (int i = 0; i < c.length; i++) {
            // if the value in the chararry is open bracket add to stack
            if (map.containsKey(c[i])) {
                stack.push(c[i]);
            }

            // if it does not contain open bracket
            else {
                // Check if the stack is empty or popping stack is not equal to the value
                if (stack.isEmpty() || map.get(stack.pop()) != c[i]) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}