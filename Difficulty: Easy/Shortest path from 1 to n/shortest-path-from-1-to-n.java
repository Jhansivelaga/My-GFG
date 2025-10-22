class Solution {
    public int minStep(int n) {
        // Base case: if n is 1, 0 steps needed
        if (n == 1) 
            return 0;

        // If divisible by 3, divide by 3
        if (n % 3 == 0) 
            return 1 + minStep(n / 3);

        // Otherwise, subtract 1
        return 1 + minStep(n - 1);
    }
}
