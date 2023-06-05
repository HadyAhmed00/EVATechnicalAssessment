
public class Main {
    public static void main(String[] args) {

        // Q1 Test
        int Q1 = 12321;
        if (Q1_PalindromeChecker.isPalindrome(Q1)) {
            System.out.println(Q1 + " is a palindrome");
        } else {
            System.out.println(Q1 + " is not a palindrome");
        }

        // Q2 Test
        int[] Q2 = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = Q2_TwoSum.twoSum(Q2, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);


        // Q3 Test
        String str = "abcabcbb";
        int length = Q3_LongestSubstring.lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);

        // Q4 Test
        int[] Q4 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = Q4_MaximumSubarraySum.maxSubarraySum(Q4);
        System.out.println("Maximum sum of contiguous subarray: " + maxSum);


    }
}