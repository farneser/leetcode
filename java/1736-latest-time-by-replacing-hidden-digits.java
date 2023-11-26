class Solution {
    public String maximumTime(String time) {
        char[] result = time.toCharArray();

        if (result[0] == '?') {
            result[0] = (result[1] == '?' || result[1] <= '3') ? '2' : '1';
        }

        if (result[1] == '?') {
            result[1] = (result[0] == '2') ? '3' : '9';
        }

        if (result[3] == '?') {
            result[3] = '5';
        }

        if (result[4] == '?') {
            result[4] = '9';
        }

        return new String(result);
    }
}
