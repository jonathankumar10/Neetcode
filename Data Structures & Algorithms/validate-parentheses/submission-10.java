class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        char[] sArray = s.toCharArray();
        for(char c : sArray){
            if(c =='{' || c == '[' || c == '('){
                stack.push(c);
            } else {
                if( !stack.isEmpty() ){
                    char value = stack.pop();
                    if(map.get(value) == c){
                        continue;
                    } else {
                        return false;
                    }
                } else if( c == ']' || c == '}' || c == ')'){
                return false;

                }
            }
        }

        return stack.isEmpty();
    }
}
