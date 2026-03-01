class Solution {
    
    int missingNum(int arr[]) {
        long a;
        long arrsum=0;
        long n=arr.length+1;
        for(int i=0;i<n-1;i++){
            arrsum+=(long)arr[i];
        }
        //sum of natural number
        a=(n*(n+1))/2;
        long miss=a-arrsum;
        return (int) miss;
        
    }
}