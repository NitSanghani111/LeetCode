class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x; // Base cases: sqrt(0) = 0, sqrt(1) = 1
        }

        int left = 0, right = x; 
        while (left <= right) { // Fix: Use <= instead of <
            int mid = left + (right - left) / 2; // Prevent overflow

            if (mid == x / mid) { // Avoid overflow instead of mid * mid == x
                return mid;
            } else if (mid > x / mid) { // Instead of mid * mid > x
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right; // `right` will be the largest integer with right^2 ≤ x
    }
}
