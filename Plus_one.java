public class Solution {
    public int[] plusOne(int[] digits) {
        int[] results = new int[digits.length + 1];
        int carry = 1;
        int index = digits.length - 1;
        
        while(carry == 1 && index >= 0) {
            if(digits[index] + carry < 10) {
                digits[index] += carry;
                carry = 0;
            } else if(digits[index] + carry == 10) {
                digits[index] = 0;
            }
            index -= 1;
        }
        if(carry == 0) return digits;
        results[0] = 1;
        return results;
    }
}
