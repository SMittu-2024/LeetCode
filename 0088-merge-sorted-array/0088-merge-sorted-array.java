class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Merge two arrays
            for(int i=0;i<n;i++){
                nums1[i+m]=nums2[i];
            }
        //sorting array
        for(int i=0;i<m+n-1;i++){
            for(int j=i+1;j<m+n;j++){
                if(nums1[i]>nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }                  
            }
        }
    }
}