
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        travel(root, a, 0);
        return a;
    }
    
    private void travel(TreeNode curr, List<List<Integer>> a, int level)
    {
        if(curr == null) return;
        
        if(a.size() <= level)
        {
            List<Integer> newLevel = new LinkedList<>();
            a.add(newLevel);
        }
        
        List<Integer> collection  = a.get(level);
        if(level % 2 == 0) collection.add(curr.val);
        else collection.add(0, curr.val);
        
        travel(curr.left, a, level + 1);
        travel(curr.right, a, level + 1);
    }
    }
