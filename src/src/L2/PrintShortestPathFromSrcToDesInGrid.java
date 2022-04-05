package L2;

public class PrintShortestPathFromSrcToDesInGrid {
    public static class Pair{
        int length = (int)1e9; // this is 10 ^9
        String path = "";

    }

    public static Pair shortestPath(int sr,int sc,int dr,int dc, int[][] directions,String[] directionsStr, int [][] grid){

        //base case
        if(sr == dr && sc == dc){
            Pair basePair = new Pair();
            basePair.length = 0;
            return basePair;
        }

        Pair result = new Pair();

        grid[sr][sc] = 1 ;//mark it as visited [1]

        for(int d = 0; d < directions.length; d ++){
            int r = sr + directions[d][0];
            int c = sc + directions[d][1];

            //check if valid cell
            if(r >= 0 && r <= dr && c >= 0 && c <= dc && grid[r][c] == 0){

                Pair temp = shortestPath(r,c,dr,dc,directions,directionsStr,grid);

                if(temp.length != (int)1e9 && temp.length + 1 < result.length){
                    result.length = temp.length + 1;
                    result.path = temp.path + directionsStr[d];

                }


            }
        }

        grid[sr][sc] = 0; // unvisit the cell after all calls are made
        return result;


    }


    public static void main(String [] args){

        int [] [] directions = {{0,1},{1,0},{1,1}};
        String [] directionsStr = {"h","v","d"};
        boolean [][] visited = new boolean[3][3];
        int [][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        Pair ans = shortestPath(0,0,2,2,directions,directionsStr,obstacleGrid );
        System.out.println(ans.length);
        System.out.println(ans.path);
    }
}
