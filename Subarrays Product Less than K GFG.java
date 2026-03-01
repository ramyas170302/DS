// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        int left=0;
        long count=0;
        long product=1;
        if (k<=1)
            return 0;
        for(int right=0;right<n;right++){
            product*=arr[right];
            while(product>=k){
                product/=arr[left++];
                
            }
            count+=(right-left+1);
        }
        return count;
    }
}
//https://www.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1?page=7&category=Arrays&sortBy=submissions