class Solution {
    public List<List<String>> findDuplicate(String[] paths) 
    {
           Map<String, List<String>> map = new HashMap<>();
        
        
        for(String path : paths) 
        {
            String[] tokens = path.split(" ");
            
            
            for(int i = 1; i < tokens.length; i++)
            {
                String file = tokens[i].substring(0, tokens[i].indexOf('('));
                
                String content = tokens[i].substring(tokens[i].indexOf('(') + 1, tokens[i].indexOf(')'));
                
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(tokens[0] + "/" + file);
            }
        }
        return map.values().stream().filter(e -> e.size() > 1).collect(Collectors.toList());
    }
    }
