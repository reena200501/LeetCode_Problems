class Solution {
    public boolean searchMatrix(int[][] A, int target) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==target)return true;
            }
        }
        return false;
        
    }
}