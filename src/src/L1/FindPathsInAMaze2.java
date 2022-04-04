package L1;

public class FindPathsInAMaze2 {

    public static int mazePath2(int sr,int sc,int dr,int dc, int[][] directions,String[] directionsStr, String psf){

        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return 1;
        }
        int paths = 0;

        for(int d = 0; d < directions.length; d++){
            int r = sr + directions[d][0];
            int c = sc + directions[d][1];

            if(r >= 0 && r <= dr && c >= 0 && c <= dc ){
                paths += mazePath2(r,c,dr,dc,directions,directionsStr,psf+directionsStr[d]);
            }else{
                //if it reaches any cell that is not in  range
                break;
            }
        }
        return paths;

    }

    public static void main(String [] args){
       // System.out.println(mazePath(0,0,2,2,""));
        int [] [] directions = {{0,1},{1,0},{1,1}};
        String [] directionsStr = {"h","v","d"};
        System.out.println(mazePath2(0,0,2,2,directions,directionsStr,""));
    }
}

/*
Output:

hhvv
hvhv
hvvh
hvd
hdv
vhhv
vhvh
vhd
vvhh
vdh
dhv
dvh
dd
13

 */


