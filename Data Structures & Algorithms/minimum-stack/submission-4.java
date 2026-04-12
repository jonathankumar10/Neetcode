// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

class MinStack {

    // Initialize 2 stacks. 
    // stack for keeping store of all the values
    // minStack for keeping the minimum
    Stack<Integer> stack =  new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    // Time complexity: O(1)
    // Space complexity: O(n)
    public MinStack() {
        this.stack = stack;
        this.minStack = minStack;
    }
    
    // To add value to stack
    public void push(int val) {
        // Add value to stack
        stack.push(val);
        // Add value to minStack if minStack is empty or if minStacks top value is greater than the value to ensure min value is always at the top
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        } 
    }
    
    // To remove top most value from stack
    public void pop() {
        // Remove top value
        int val = stack.pop();
        // Remove top value from minStack if minStack is not empty and minStack value is equal to stack value to ensure same values
        if(!minStack.isEmpty() && minStack.peek() == val){
            minStack.pop();
        }
    }
    
    // To return top value from stack
    public int top() {
        return stack.peek();
    }
    
    // To get minimum value from stack
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */