class Solution {
    public String largestNumber(int[] nums) {
        
        if(nums.length == 0)
            return "";
        
        String[] a = new String [nums.length];
        for(int i=0; i<nums.length; i++){
            a[i] =Integer.toString(nums[i]);
            
        }
        Arrays.sort(a, new Comparator<String>(){
            public int compare(String x,String y){
                String n = x+y;
                String m = y+x;
                return m.compareTo(n);
                
            }
        });
        
        if (a[0].equals("0"))
            return "0";
        
        StringBuilder J =new StringBuilder();
        for(String s : a){
            J.append(s);
            
        }
            return J.toString();
        
    }
}