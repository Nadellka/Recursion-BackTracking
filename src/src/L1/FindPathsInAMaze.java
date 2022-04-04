package L1;

public class FindPathsInAMaze {

    public static int mazePath(int sr,int sc,int dr,int dc, String psf){

        //Base Case
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return 1;
        }
        int paths = 0;
        //move right
        if(sc+1 <= dc){
           paths += mazePath(sr,sc+1,dr,dc,psf+"h");
        }

        //move down
        if(sr+1 <= dr){
            paths += mazePath(sr+1,sc,dr,dc,psf+"v");
        }

        //move diagonal
        if(sr+1 <= dr && sc+1 <= dc){
            paths += mazePath(sr+1,sc+1,dr,dc,psf+"d");
        }

        return paths;

    }

    public static void main(String [] args){
        System.out.println(mazePath(0,0,2,2,""));
    }
}
