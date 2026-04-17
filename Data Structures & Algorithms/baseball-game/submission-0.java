class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(String op: operations){
            if(op.equals("+")){
                int first = stack.pop();
                int second = first + stack.peek();
                stack.push(first);
                stack.push(second);
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                int value = stack.peek() *2;
                stack.push(value);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        System.out.println(stack);
        for(int value: stack){
            result = result + value;
        }
        return result;
    }
}