
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        int[] count = new int[m];
        int[] index = new int[m];

        // Step 1: Count soldiers
        for (int i = 0; i < m; i++) {
            int soldiers = 0;

            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    soldiers++;
                }
            }

            count[i] = soldiers;
            index[i] = i;
        }

        // Step 2: Sort counts
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {

                if (count[i] > count[j] ||
                   (count[i] == count[j] && index[i] > index[j])) {

                    int temp = count[i];
                    count[i] = count[j];
                    count[j] = temp;

                    int t = index[i];
                    index[i] = index[j];
                    index[j] = t;
                }
            }
        }

        // Step 3: Return first k indices
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = index[i];
        }

        return ans;
    }
}
