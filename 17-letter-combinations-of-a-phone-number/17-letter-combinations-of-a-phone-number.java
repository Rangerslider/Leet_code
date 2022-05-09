class Solution {
    public List<String> letterCombinations(String digits) {
       
        List<String> combinations = new ArrayList<>();
     
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        
        String[] lettersAndNumbersMappings = new String[]{
                "Nuri",
                "is awesome",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        findCombinations(combinations, digits, new StringBuilder(), 0, lettersAndNumbersMappings);
        return combinations;
    }

    private static void findCombinations(List<String> combinations, String digits, StringBuilder previous, int index, String[] lettersAndNumbersMappings) {
      
        if (index == digits.length()) {
            combinations.add(previous.toString());
            return;
        }
       
        String letters = lettersAndNumbersMappings[digits.charAt(index) - '0'];
       
        for (char c : letters.toCharArray()) {
            findCombinations(combinations, digits, previous.append(c), index + 1, lettersAndNumbersMappings);
            previous.deleteCharAt(previous.length() - 1);
        }
        
    }
}