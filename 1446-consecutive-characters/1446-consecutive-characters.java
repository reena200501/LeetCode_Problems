class Solution {
    public int maxPower(String s) {
        // Base case: if string is empty, power is 0
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxPower = 1;
        int currentPower = 1;
        
        // Loop through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentPower++;
            } else {
                currentPower = 1; // Reset count for a new character sequence
            }
            
            // Keep track of the highest count found so far
            maxPower = Math.max(maxPower, currentPower);
        }
        
        return maxPower;
    }
}