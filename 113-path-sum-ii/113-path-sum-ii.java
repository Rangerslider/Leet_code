
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        getPathSum(root, 0, sum, path, res);
        return res;
    }

    public void getPathSum(TreeNode node, int depth, int sum, List<Integer> path, List<List<Integer>> res) {
        if (node == null) {
            return;
        }

        path.add(node.val);

        if (node.left == null && node.right == null && node.val == sum) {
            res.add(new ArrayList(path));
        }

        getPathSum(node.left, depth + 1, sum - node.val, path, res);
        getPathSum(node.right, depth + 1, sum - node.val, path, res);

        path.remove(path.size() - 1);
    }
}