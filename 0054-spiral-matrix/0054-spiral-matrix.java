class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
             List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;

        while (rowstart <= rowend && colstart <= colend) {
            // Traverse right
            for (int i = colstart; i <= colend; i++) {
                res.add(matrix[rowstart][i]);
            }
            rowstart++;

            // Traverse down
            for (int i = rowstart; i <= rowend; i++) {
                res.add(matrix[i][colend]);
            }
            colend--;

            // Traverse left
            if (rowstart <= rowend) {
                for (int i = colend; i >= colstart; i--) {
                    res.add(matrix[rowend][i]);
                }
                rowend--;
            }

            // Traverse up
            if (colstart <= colend) {
                for (int i = rowend; i >= rowstart; i--) {
                    res.add(matrix[i][colstart]); 
                }
                colstart++;
            }
        }

        return res;

    }
}