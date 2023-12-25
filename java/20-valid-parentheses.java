import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
 
        LinkedList<Character> openBrackets = new LinkedList<>();
        Map<Character, Character> brackets = new HashMap<>();

        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');

        for (Character c : s.toCharArray()) {
            if (!brackets.containsKey(c)) {
                openBrackets.add(c);
            } else {
                if (openBrackets.isEmpty() || brackets.get(c) != openBrackets.removeLast()) {
                    return false;
                }
            }
        }

        return openBrackets.isEmpty();
    }
}

