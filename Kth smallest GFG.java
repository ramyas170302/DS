class Solution {
    public int kthSmallest(int[] arr, int k) {
       
        Arrays.sort(arr);
       
        /*Time complexity: 
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/
        
        return arr[k-1];
    }
}
//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&category=Arrays&sortBy=submissions
