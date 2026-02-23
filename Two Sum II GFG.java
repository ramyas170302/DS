// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
       
        /*Time complexity :o(n^2)
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;*/

        
        // time complexity:o(n)
        int left=0;
        int right=arr.length-1;
        int count=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                count++;
                if(right!=1)
                    right--;
                else
                    left++;
                //left++;
                //right--;
            }
            else if(sum<target){
                left++;
            }
            else
                right--;
        }
        return count;
    }
}
