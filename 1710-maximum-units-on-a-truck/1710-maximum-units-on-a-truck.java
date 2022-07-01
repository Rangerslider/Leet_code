class Solution {
    public int maximumUnits(int[][] boxtypes, int trucksize) {
        Arrays.sort(boxtypes,(n,j) -> -Integer.compare(n[1], j[1]));
        int result = 0;
        for (int box[]:boxtypes){
            if (trucksize <box[0]){
                return result + trucksize * box[1];
                
            }
            result +=box[0]*box[1];
            trucksize -=box[0];
        }
        return result ;
    }
}