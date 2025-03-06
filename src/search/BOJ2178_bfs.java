package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_bfs {

    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] a;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new boolean[n][m];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            String line = st.nextToken();
            for (int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(a[n-1][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[i][j] = true;
            for (int k=0; k<4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (a[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        a[x][y] = a[now[0]][now[1]] + 1;
                        queue.add(new int[] {x,y});
                    }
                }

            }
        }
    }
}
