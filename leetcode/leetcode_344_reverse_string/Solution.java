package leetcode_344_reverse_string;

public class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (l < s.length/2) {
            char temp;
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;

        }
    }
}
