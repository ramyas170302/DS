class Solution {
    public int rowWithMax1s(int arr[][]) {
       
        int res[]=new int[arr.length];// to store number of 1's in each row
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            res[i]=count;
        }
        //rteurn the row number which have more one's
        int max=0;
        for(int j=1;j<res.length;j++){
            if(res[max]<res[j])
                max=j;
        }
        //if no 1's 
        if (res[max]==0){
            return -1;
        }
        else{
            return max;
        }
       
            
    }
}
//https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=2&category=Arrays&sortBy=submissions