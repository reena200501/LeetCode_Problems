class Solution {
    public int getLucky(String s, int k) {
        String str = "";

        // Convert each character to its alphabet position
        for (int i = 0; i < s.length(); i++) {
            str += (s.charAt(i) - 'a' + 1);
        }

        int sum = 0;
        while (k > 0) {
            sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }

            str = Integer.toString(sum);
            k--;
        }

        return sum;
        
    }
}