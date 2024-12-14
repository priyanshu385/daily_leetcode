class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int srow = 0, scol = 0, erow = m - 1, ecol = n - 1;
        List<Integer> list = new ArrayList<>();

        while (srow <= erow && scol <= ecol) {
            // Traverse right
            for (int j = scol; j <= ecol; j++) {
                list.add(mat[srow][j]);
            }
            // Traverse down
            for (int i = srow + 1; i <= erow; i++) {
                list.add(mat[i][ecol]);
            }
            // Traverse left (only if there are remaining rows)
            if (srow < erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    list.add(mat[erow][j]);
                }
            }
            // Traverse up (only if there are remaining columns)
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    list.add(mat[i][scol]);
                }
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return list;
    }
}
