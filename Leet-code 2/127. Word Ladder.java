class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList.size() == 0)   return 0;
        int L = wordList.get(0).length();
     
        Map<String, List<String>> map = new HashMap<>();
        wordList.forEach(
            word -> {
                for (int i = 0; i < L; i++) {
                    String s = word.substring(0, i) + "*" + word.substring(i+1);
                    if (!map.containsKey(s)) {
                        map.put(s, new ArrayList<>());
                    }
                    map.get(s).add(word);
                }
            }
        );
     
        int path = 1;
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        q.add(beginWord);
        set.add(beginWord);
        Queue<String> temp = new LinkedList<>();
      
        do {
            temp = new LinkedList<>();
            path++;
            while (!q.isEmpty()) {
                String cur = q.poll();
                Set<String> neighbors = new HashSet<>();
                for (int i = 0; i < L; i++) {
                    String s = cur.substring(0,i) + "*" + cur.substring(i+1);
                    if (map.containsKey(s))
                        neighbors.addAll(map.get(s));
                }
                for (String neighbor : neighbors) {
                    if (!set.contains(neighbor)) {
                        temp.add(neighbor);
                        set.add(neighbor);
                    }
                }
            }
            q = temp;
        } while (temp.size() != 0 && !set.contains(endWord));

        if (set.contains(endWord))  return path;
        return 0;
    }
}