class LFUCache {
    private int min;
    private int capa;
    private Map<Integer, Integer> keyValue;
    private Map<Integer, Integer> keyCount;
    private Map<Integer, LinkedHashSet<Integer>> countLRUKeys;

    public LFUCache(int capacity) {
        this.min = 0;
        this.keyValue = new HashMap<>();
        this.keyCount = new HashMap<>();
        this.countLRUKeys = new HashMap<>();
        this.capa = capacity;
    }
    
    public int get(int key) {
        if (!keyValue.containsKey(key)) {
            return -1;
        }
        
        int cnt = keyCount.get(key);
        
        keyCount.remove(key);
        countLRUKeys.get(cnt).remove(key);
        
        if (cnt == min && countLRUKeys.get(cnt).size() == 0) {
            min++;
        }
        
        keyCount.put(key, cnt + 1);
        countLRUKeys.computeIfAbsent(cnt + 1, dummy -> new LinkedHashSet<Integer>());
        countLRUKeys.get(cnt + 1).add(key);
        
        return keyValue.get(key);
    }
    
    public void put(int key, int value) {
        if (capa <= 0) {
            return;
        }
        
        if (keyValue.containsKey(key)) {
            int cnt = keyCount.get(key);
            
            keyCount.remove(key);
            countLRUKeys.get(cnt).remove(key);
            
            keyValue.put(key, value);
            keyCount.put(key, cnt + 1);
            countLRUKeys.computeIfAbsent(cnt + 1, dummy -> new LinkedHashSet<Integer>());
            countLRUKeys.get(cnt + 1).add(key);
            
            if (cnt == min && countLRUKeys.get(cnt).size() == 0) {
                min++;
            }
        }
        else {
            if (keyValue.size() == capa) {
                int removeKey = countLRUKeys.get(min).iterator().next();
                keyValue.remove(removeKey);
                keyCount.remove(removeKey);
                countLRUKeys.get(min).remove(removeKey);
            }
                   
            min = 1;
            keyValue.put(key, value);
            keyCount.put(key, min);
            countLRUKeys.computeIfAbsent(min, dummy -> new LinkedHashSet<Integer>());
            countLRUKeys.get(min).add(key);
        }  
    }
}