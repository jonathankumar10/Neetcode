class Solution {
    public boolean isValid(String s) {
        char[] charArray =  s.toCharArray();
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> dict = new HashMap<>();
        dict.put('(',')');
        dict.put('[',']');
        dict.put('{','}');


        for(char c: charArray){
            if(dict.containsKey(c)){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char bracket = stack.pop();
                if(dict.get(bracket) != c){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
