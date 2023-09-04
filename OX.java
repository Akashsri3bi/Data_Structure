public class OX {

        public char[][] fill(int n, int m, char a[][])
    {
        // code here
    for (int i = 0; i < n; i++) {
        if (a[i][0] == 'O') {
            dfs(a, i, 0);
        }
        if (a[i][m - 1] == 'O') {
            dfs(a, i, m - 1);
        }
    }
    for (int j = 0; j < m; j++) {
        if (a[0][j] == 'O') {
            dfs(a, 0, j);
        }
        if (a[n - 1][j] == 'O') {
            dfs(a, n - 1, j);
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (a[i][j] == '-') {
                a[i][j] = 'O';
            } else if (a[i][j] == 'O') {
                a[i][j] = 'X';
            }
        }
    }
    return a;
}

private void dfs(char[][] a, int i, int j) {
    if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] != 'O') {
        return;
    }
    a[i][j] = '-';
    dfs(a, i + 1, j);
    dfs(a, i - 1, j);
    dfs(a, i, j + 1);
    dfs(a, i, j - 1);
 

    }
      
}
