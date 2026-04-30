class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i =sandwiches.length -1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }
        for(int i =0; i < students.length; i++){
            queue.add(students[i]);
        }

        int refused = 0;
        while(!queue.isEmpty() && !stack.isEmpty() && refused <queue.size()){
            int student = queue.peek();
            if(student == stack.peek()){
                queue.poll();
                stack.pop();
                refused = 0;
            }else{
                queue.add(queue.poll());
                refused++;
            }
        }
    
        return queue.size();
    }
}