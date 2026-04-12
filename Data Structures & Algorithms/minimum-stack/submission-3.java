class MinStack {

    Stack<Integer> minStack= new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public MinStack() {
        this.minStack = minStack;
        this.stack = stack;
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        if (top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
