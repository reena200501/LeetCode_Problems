class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];

            if (w.length() > 2) {
                w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
            }

            ans.append(w);

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}