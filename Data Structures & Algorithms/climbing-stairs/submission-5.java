class Solution {
    public int climbStairs(int n) {
        int p1 = 1;
        int p2 = 2;
        int res = 0;
    
        if(n == 1){
            return p1;
        }
        if(n == 2){
            return p2;
        }

        for(int i = 2; i < n; i++){
            res = p1+p2;
            p1 = p2;
            p2 = res;
        }


        return res;
    }
}
