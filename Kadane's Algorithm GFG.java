class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max=arr[0];
        int sum=0;
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}
//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Arrays&sortBy=submissions