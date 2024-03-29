class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
                int start = 0, total = 0, tank = 0;
        for(int i = 0; i < gas.length; i++){
            tank = tank+gas[i];
            if(tank - cost[i] < 0){ 
                start = i + 1;
                total = total +gas[i]  -cost[i];
                tank = 0;
                continue;
            }
            tank = tank-cost[i];
            total = total+gas[i]-cost[i];
        }
        if(total >= 0) return start;
        return -1;
        
    }
}