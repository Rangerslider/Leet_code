
class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
            if (num.length == 0) {
          return null;
      }
      TreeNode root = arrayToTreeConverter(num, 0, num.length - 1);
      return root;
    }
    public TreeNode arrayToTreeConverter(int[] num, int low, int high) {
        if (low > high) { 
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = arrayToTreeConverter(num, low, mid - 1);
        root.right = arrayToTreeConverter(num, mid + 1, high);
        return root;
    }
}