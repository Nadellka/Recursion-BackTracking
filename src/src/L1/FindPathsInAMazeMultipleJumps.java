package L1;

public class FindPathsInAMazeMultipleJumps {
    public static int mazePathWithMultipleJumps(int sr,int sc,int dr,int dc, int[][] directions,String[] directionsStr, String psf){

        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return 1;
        }
        int paths = 0;

        for(int d = 0; d < directions.length; d++){
            //Fixing the direction and increasing the no.of jumps, reduces number of unnecessary calls
            for(int rad = 1; rad <= Math.max(dr,dc); rad++){
                int r = sr + rad  * (directions[d][0]);
                int c = sc + rad  * (directions[d][1]);

                if(r >= 0 && r <= dr && c >= 0 && c <= dc){

                    paths += mazePathWithMultipleJumps(r,c,dr,dc,directions,directionsStr,psf+directionsStr[d] + rad);
                }else{
                    //if it reaches any cell that is not in  range
                    break;
                }
            }

        }
        return paths;

    }

    public static void main(String [] args){
        // System.out.println(mazePath(0,0,2,2,""));
        int [] [] directions = {{0,1},{1,0},{1,1}};
        String [] directionsStr = {"h","v","d"};
        System.out.println(mazePathWithMultipleJumps(0,0,2,2,directions,directionsStr,""));
    }

}

/*
Output
h1h1v1v1
h1h1v2
h1v1h1v1
h1v1v1h1
h1v1d1
h1v2h1
h1d1v1
h2v1v1
h2v2
v1h1h1v1
v1h1v1h1
v1h1d1
v1h2v1
v1v1h1h1
v1v1h2
v1d1h1
v2h1h1
v2h2
d1h1v1
d1v1h1
d1d1
d2
22

 */

