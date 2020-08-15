class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, k = n-1, j= m+n-1;
        while(i>=0 && k>=0){
            if(nums1[i]>=nums2[k]){
                nums1[j--]=nums1[i--];
            } else {
                nums1[j--]=nums2[k--];
            }
        }
        while(j>=0){
            if(k>=0){
                nums1[j--]=nums2[k--];
            } else {
                j--;
            }
            
        }
    }
}
