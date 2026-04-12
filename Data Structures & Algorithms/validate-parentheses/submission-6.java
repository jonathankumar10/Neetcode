class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> dict = new HashMap<>();
        dict.put('(',')');
        dict.put('[',']');
        dict.put('{','}');

        for(char c : s.toCharArray()){
            if(dict.containsKey(c)){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()){
                    char open = stack.pop();
                    if(dict.get(open) != c){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
