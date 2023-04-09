class Solution {
    public String getHint(String secret, String guess) {
       int[] visited = new int[10];
        int count1 = 0, count2 = 0;
        for(int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g) {
                count1++;
            }
            else {
                if(visited[s] < 0) {
                    count2++;
                }
                visited[s]++;
                if(visited[g] > 0) {
                    count2++;
                }
                visited[g]--;
            }
        }
        return new String(count1 + "A" + count2 + "B"); 
    }
}