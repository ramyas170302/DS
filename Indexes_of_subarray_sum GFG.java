
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        //sliding window method 
        ArrayList<Integer>a=new ArrayList<>();
        int sum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            //if sum > than target then slide the window
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            //check 
            if(sum==target){
                a.add(left+1);
                a.add(right+1);
                return a;
                //end
            }
        }
        a.add(-1);
        return a ;
    }
}
