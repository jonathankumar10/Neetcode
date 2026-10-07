class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int bestStart = 0;
        int bestLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome
            int left = i;
            int right = i;

            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                left--;
                right++;
            }

            int oddLength = right - left - 1;

            // Even-length palindrome
            left = i;
            right = i + 1;

            while (
                left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)
            ) {
                left--;
                right++;
            }

            int evenLength = right - left - 1;

            int currentLength = Math.max(oddLength, evenLength);

            if (currentLength > bestLength) {
                bestLength = currentLength;

                // Figure out where this palindrome starts
                bestStart = i - (currentLength - 1) / 2;
            }
        }

        return s.substring(bestStart, bestStart + bestLength);
    }
}