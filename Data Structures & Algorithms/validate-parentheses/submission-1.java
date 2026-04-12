class Solution {
    public boolean isValid(String s) {
        char[] charArray =  s.toCharArray();
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> dict = new HashMap<>();
        dict.put(')','(');
        dict.put(']','[');
        dict.put('}','{');

        System.out.println("initial stack -> " +stack);


        for(char c: charArray){

            System.out.println("c -> " +c);
            System.out.println("stack -> " +stack);

            if(dict.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == dict.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
