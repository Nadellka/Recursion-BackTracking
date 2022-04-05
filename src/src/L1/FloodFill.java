package L1;

public class FloodFill {
    public static int floodFill(int sr,int sc,int dr,int dc, int[][] directions,String[] directionsStr, boolean [][] visited,String psf){

        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return 1;
        }

        //as soon as we come, we can mark true, to avoid calls
        visited [sr][sc] = true;
        int paths = 0;

        for(int d = 0; d < directions.length; d++){
            int r = sr + directions[d][0];
            int c = sc + directions[d][1];

            if(r >= 0 && r <= dr && c >= 0 && c <= dc){
                if(!visited[r][c]){
                    paths += floodFill(r,c,dr,dc,directions,directionsStr, visited,psf+directionsStr[d]);
                }else{
                    break;
                }

            }
        }
        //BackTracking step
        visited[sr][sc] = false;
        return paths;



    }

    public static void main(String [] args){

        int [] [] directions = {{0,1},{1,0},{1,1}};
        String [] directionsStr = {"h","v","d"};
        boolean [][] visited = new boolean[3][3];
        System.out.println(floodFill(0,0,2,2,directions,directionsStr, visited,""));
    }

}

