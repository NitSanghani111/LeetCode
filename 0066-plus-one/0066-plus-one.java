class Solution {
    public int[] plusOne(int[] digits) {
        int p = digits.length - 1;
        for (int i = p; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        int[] ans = new int[p + 2];
        ans[0] = 1;
        return ans;

    }
}