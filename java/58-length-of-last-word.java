class Solution {
    public int lengthOfLastWord(String s) {
        int pointer = s.length() - 1;

        while (pointer >= 0 && s.charAt(pointer) == ' ') {
            --pointer;
        }

        final int end = pointer;
        
        while (pointer >= 0 && s.charAt(pointer) != ' ') {
            --pointer;
        }

        return end - pointer;
    }
}
