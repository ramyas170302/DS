class Solution {
    public void rearrange(int arr[]) {
        // code here
        /*int start=0;
        int end=0;
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            start=i;
            end=(arr.length-1)-i;
            res[start]=arr[start];
            res[end]=arr[end];
        }*/
        Arrays.sort(arr);
        int start=arr.length-1;
        int end=0;
        int copy[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        for(int j=0;j<arr.length;j+=2){
            
            arr[j]=copy[start--];
        }
        for(int k=1;k<arr.length;k+=2){
            
            arr[k]=copy[end++];
            
        }
        
        
        
    }
}
//https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1?page=4&category=Arrays&sortBy=submissions