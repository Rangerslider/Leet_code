class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
       
    int a = n - 1;     
    int b = m - 1;    
    int c = n + m - 1;

    while (b >= 0)
      if (a >= 0 && nums1[a] > nums2[b])
        nums1[c--] = nums1[a--];
      else
        nums1[c--] = nums2[b--];
  }
}