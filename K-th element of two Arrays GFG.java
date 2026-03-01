class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int fin[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            fin[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            fin[a.length+j]=b[j];
        }
        Arrays.sort(fin);
        //System.out.println(fin);
        return fin[k-1];
        
    }
}
//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?page=2&category=Arrays&sortBy=submissions