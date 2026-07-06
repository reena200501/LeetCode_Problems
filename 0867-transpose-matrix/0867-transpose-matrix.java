class Solution {
    public int[][] transpose(int[][] A) {
        int r=A.length,c=A[0].length;
        int B[][]=new int[c][r];
        for (int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                B[i][j]=A[j][i];
            }
        }
        return B;
        
    }
}