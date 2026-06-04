class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int size = mat.length;
        for(int i=0; i<size; i++){
            sum += mat[i][i];
            sum += mat[i][size-1-i];
        }
        if(size%2 == 1){
            sum -= mat[size/2][size/2];
        }
    return sum;
    }
}