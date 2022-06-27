class Solution {
    public int minPartitions(String n) {
         char nuri = '0';
        for (char a : n.toCharArray())
            if (a > nuri) nuri = a;
        return nuri - '0';
        
    }
}