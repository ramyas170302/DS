//if array have negative value then asked for subarray use "Kadane's method"

class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
//https://leetcode.com/problems/maximum-subarray/