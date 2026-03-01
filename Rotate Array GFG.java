class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        d=d%arr.length;
        int a[]=new int[d];
        int b[]=new int[arr.length-d];
        for(int i=0;i<d;i++){
            a[i]=arr[i];
        }
        for(int j=0;j<arr.length-d;j++){
            b[j]=arr[d+j];
        }
        for(int k=0;k<b.length;k++){
            arr[k]=b[k];
        }
        for(int r=0;r<a.length;r++){
           arr[r+b.length]=a[r]; 
        }
        //return arr;
        
    }
}
//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1?page=1&category=Arrays&sortBy=submissions