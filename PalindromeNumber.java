class Solution {
    public boolean isPalindrome(int x) {
        boolean palindrome = true;
        Integer y = x;
        int j = y.toString().length()-1;

        for (int i = 0; i < y.toString().length()/2; i++) {
            if (y.toString().charAt(i) != y.toString().charAt(j)) {
                palindrome = false;
            }

            j--;
        }

        return palindrome;
    }
}
