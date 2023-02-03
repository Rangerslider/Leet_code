class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
              if(words == null || words.length == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        Set<String> dict = new HashSet<>();
        for(String word: words) {
            dict.add(word);
        }
        // key: word, value: how many words key is composed from dict
        Map<String, Boolean> visited = new HashMap<>();
        for(String word: words) {
            //System.out.println("word = " + word);
            if(dfs(word, dict, visited)) {
                result.add(word);
            }
        }
        return result;
    }
    public boolean dfs(String word, Set<String> dict, Map<String, Boolean> visited) {
        if(visited.containsKey(word)) {
            return visited.get(word);
        }
        for(int i = 0; i < word.length() - 1; i++) {
            if(dict.contains(word.substring(0, i + 1))) {
                String suffix = word.substring(i + 1);
                if(dict.contains(suffix) || dfs(suffix, dict, visited)) {
                    visited.put(word, true);
                    return true;
                }
            }
        }
        visited.put(word, false);
        return false;  
    }
}