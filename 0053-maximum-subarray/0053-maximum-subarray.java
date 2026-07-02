class Solution {
    public int maxSubArray(int[] n) {
        int sum=0;
        int max=n[0];
        for(int i=0;i<n.length;i++){
           sum=sum+n[i];
           max=Math.max(max,sum);
           if(sum<0)sum=0;
    }
    return max;
 }
}