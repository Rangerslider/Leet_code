class Solution {
    public int bagOfTokensScore(int[] tokens, int power) 
    {
    int ans = 0;
    int score = 0;
    int i = 0;                                    // index er ekdom small token
    int j = tokens.length - 1;                    // index er ekdom highest token

    Arrays.sort(tokens);

    while (i <= j && (power >= tokens[i] || score > 0)) 
    {
      while (i <= j && power >= tokens[i]) 
      {
       
        power -= tokens[i++];  // ekhane small token using hosse 
        ++score;
      }
        
      ans = Math.max(ans, score);
      if (i <= j && score > 0)
      {
       
        power += tokens[j--];  // ekhane highest token use hosse 
        --score;
      }
    }

    return ans;
    }
}