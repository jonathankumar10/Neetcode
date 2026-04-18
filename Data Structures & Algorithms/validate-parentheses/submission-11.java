class Solution {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public boolean isValid(String s) {

        // Step 1: Initialize stack and map containing all combinations we want to check
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        // Step 2: convert string to array of chars
        char[] sArray = s.toCharArray();

        // Step 4: iterate through array
        for(char c : sArray){
            // Step 5: if opening parenthesis add to stack
            if(c =='{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                // Step 6: As long as stack is not empty, if value on top is not equal to closing parenthesis return false
                if( !stack.isEmpty() ){
                    char value = stack.pop();
                    if(map.get(value) == c){
                        continue;
                    } else {
                        return false;
                    }
                }
                // Step 7: If only closing parenthesis return false 
                else if( c == ']' || c == '}' || c == ')'){
                    return false;
                }
            }
        }
        // Step 8: Check if stack is empty and return
        return stack.isEmpty();
    }
}
