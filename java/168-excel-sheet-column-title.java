import java.lang.StringBuilder;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0){
            int value = (columnNumber - 1) % 26;
        
            sb.append(Character.toString((char)('A' + value)));
        
            columnNumber = (columnNumber - 1) / 26;
        }
        
        return sb.reverse().toString();
    }
}
