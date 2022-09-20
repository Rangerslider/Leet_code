// class Solution {
//     public int findLength(int[]nums1, int[]nums2)
//     {
//         int res = 0;
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j]) {
//                     int k = 1;
//                     while (i + k < nums1.length && j + k < nums2.length && nums1[i + k] == nums2[j + k]) k++;
//                     res = Math.max(res, k);
//                 }
//             }
//         }
//         return res;
//     }
// } time limited exceed 


class Solution {
    public int findLength(int[]array1, int[]array2)
    {
        int output = 0;
        int val[][] = new int[array1.length + 1][array2.length + 1];
        for (int i = array1.length - 1; i >= 0; --i)
        {
            for (int j = array2.length - 1; j >= 0; --j)
            {
                if (array1[i] == array2[j])
                {
                    val[i][j] = val[i+1][j+1] + 1;
                    if(output < val[i][j])
                        output = val[i][j];
                }
            }
        }
        return output;
    }

}