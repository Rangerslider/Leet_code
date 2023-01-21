class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
                List<List<Integer>>res = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        dfs(res, element, 0, nums);

        return new ArrayList(res);

    }

    private void dfs(List<List<Integer>>res, List<Integer> element, int pos, int[] nums){
        if(element.size()>= 2) res.add(new ArrayList(element));
        Set<Integer> s = new HashSet<>(nums.length);
        for (int i  = pos; i < nums.length; i++){
            if ((element.size() == 0 || element.get(element.size() - 1) <= nums[i] )&& !s.contains(nums[i])){
                element.add(nums[i]);
                dfs(res, element, i + 1, nums);
                element.remove(element.size() - 1);
                s.add(nums[i]);
            }
        }
        
    }
}