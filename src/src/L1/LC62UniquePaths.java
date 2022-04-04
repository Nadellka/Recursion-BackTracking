package L1;
//https://leetcode.com/problems/unique-paths/
//Gives Time Limit Exceeded
public class LC62UniquePaths {
    public static int uniquePaths(int m, int n) {

        int[][] directions = {{1,0},{0,1}};
        boolean [][] visited = new boolean[m][n];
        int [] result = new int[1];
        int count = helper(0,0,m-1,n-1,directions,visited, result);
        return count;

    }

    public static int helper(int sr,int sc, int dr, int dc,int[][] directions,boolean [][] visited,int[] result ) {

        if (sr == dr && sc == dc) {

            return 1;

        }

        visited[sr][sc] = true;
        int count = 0;
        for (int d = 0; d < directions.length; d++) {
            int r = sr + directions[d][0];
            int c = sc + directions[d][1];

            if (r >= 0 && c >= 0 && r <= dr && c <= dc) {
                if (!visited[r][c]) {
                    count += helper(r, c, dr, dc, directions, visited, result);
                } else {
                    break;
                }
            }

        }
        visited[sr][sc] = false;
        return count;


    }

    public static void main(String [] args){


        System.out.println(uniquePaths(3,7));
    }
}

