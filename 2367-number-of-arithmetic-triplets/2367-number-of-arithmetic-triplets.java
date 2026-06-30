class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int num : nums) {
            boolean first = false;
            boolean second = false;

            for (int x : nums) {
                if (x == num + diff)
                    first = true;
                if (x == num + 2 * diff)
                    second = true;
            }

            if (first && second)
                count++;
        }

        return count;
    }
}