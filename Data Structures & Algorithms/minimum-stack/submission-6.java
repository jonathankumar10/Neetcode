class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if((!minStack.isEmpty() && minStack.peek() >= val) || minStack.isEmpty()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int value = stack.pop();
        if(!minStack.isEmpty() && value == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;    
    }
}
