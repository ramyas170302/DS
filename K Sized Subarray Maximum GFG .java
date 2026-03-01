Maximumclass Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer>List=new ArrayList<>();
        int left=0;
        int right=0;
        int fin=0;
        int j=0;
        int max=0;
        while(j!=arr.length){
            for(int right=j;right<k;right++){
                max=0;
                if(arr[i]>max){
                    max=arr[i];
                }
                
            }
            List.add(max);
            j++;
        }
        return List;
    }
    }

//https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1?page=2&category=Arrays&sortBy=submissions