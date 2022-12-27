public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) return  nums.length;
        int i = 0;
        int result = i;
        while(i <= nums.length - 2) {
            if(target > nums[i] && target <= nums[i+1]) {
                result = i + 1;
                break;
            }
            if(target == nums[i]) {
                result = i;
                break;
            }
            i += 1;
        }
        return result;
    }
}
