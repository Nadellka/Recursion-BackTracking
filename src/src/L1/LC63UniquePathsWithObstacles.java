package L1;
//https://leetcode.com/problems/unique-paths-ii/
//Time Limit Exceeded
public class LC63UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] directions = {{1,0},{0,1}};

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // to test [[1]] and [[0],[1]] the start and end are obstacles
        if(obstacleGrid[0][0] == 1 ||obstacleGrid[m-1][n-1]  == 1 ) return 0;
        return  helper(0,0,m-1,n-1,directions,obstacleGrid);


    }

    public static int helper(int sr,int sc, int dr, int dc,int[][] directions,int[][] obstacleGrid){

        if(sr == dr && sc == dc){

            return 1;

        }

       // obstacleGrid[sr][sc] = 1; //it's not required mark and unmark for this question
        int count = 0;
        for(int d = 0; d < directions.length; d++){
            int r = sr + directions[d][0];
            int c = sc + directions[d][1];

            if(r >= 0 && c >= 0 && r <= dr && c <= dc && obstacleGrid[r][c] == 0){

                count +=  helper(r,c,dr,dc,directions,obstacleGrid);

            }

        }
       // obstacleGrid[sr][sc] = 0;
        return count;

    }

    public static void main(String [] args){
        int [][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}



