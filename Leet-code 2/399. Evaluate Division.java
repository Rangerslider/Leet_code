class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> hm = new HashMap<>();
        
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double quotient = values[i];
            
            if (hm.containsKey(dividend)) {
                Map<String, Double> temp = hm.get(dividend);
                temp.put(divisor, quotient);
                hm.put(dividend, temp);
            }
            else {
                Map<String, Double> temp = new HashMap<>();
                temp.put(divisor, quotient);
                hm.put(dividend, temp);
            }
            
            if (hm.containsKey(divisor)) {
                Map<String, Double> temp = hm.get(divisor);
                temp.put(dividend, 1 / quotient);
                hm.put(divisor, temp);
            }
            else {
                Map<String, Double> temp = new HashMap<>();
                temp.put(dividend, 1 / quotient);
                hm.put(divisor, temp);
            }
        }
        
        int qLen = queries.size();
        double[] ans = new double[qLen];
        
        for (int j = 0; j < qLen; j++) {
            String qDividend = queries.get(j).get(0);
            String qDivisor = queries.get(j).get(1);
            
            if (!hm.containsKey(qDividend)) {
                ans[j] = -1.0;
            }
            else if (qDividend == qDivisor) {
                ans[j] = 1.0;
            }
            else {
                Set<String> visited = new HashSet<>();
                ans[j] = dfs(hm, qDividend, qDivisor, 1, visited);  
            }
        }
        
        return ans;
    }
    
    private double dfs(Map<String, Map<String, Double>> hm, String dividend, String divisor, double accProduct, Set<String> visited) {
        double result = -1.0;
        
        if (hm.get(dividend).containsKey(divisor)) {
            accProduct *= hm.get(dividend).get(divisor);
            
            return accProduct;
        }
        else {
            Map<String, Double> curMap = hm.get(dividend);
            
            for (String dvs :curMap.keySet()) {
                if (visited.contains(dvs)) {
                    continue;
                }
                
                visited.add(dvs);
                result = dfs(hm, dvs, divisor, accProduct * curMap.get(dvs), visited);
                
                if (result != -1.0) {
                    break;
                }
            }   
        }
        
        return result;
    }
}