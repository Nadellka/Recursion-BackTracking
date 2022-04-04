package L4;

public class NQueensPermutations2D {
    public static int NQueenPermutationS2d(boolean [][] arr, int queens,int queensPlaced,String psf){

        if(queensPlaced == queens ){
            System.out.println(psf);
            return 1;
        }
        int count =0 ;
        int n = arr.length;
        for(int i = 0; i < n*n;i++){
            int r = i /n ;
            int c = i %n ;
            if(!arr[r][c] && isSafe(arr,r,c)){
                arr[r][c] = true;
                count += NQueenPermutationS2d(arr,queens,queensPlaced+1,psf + "(" + r + "," + c + ") ");
                arr[r][c] = false;
            }

        }

        return count;

    }


    public static boolean isSafe(boolean [][] arr, int r, int c) {
        int [][] directions = {{0,-1},{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1}};
        int n = arr.length;
        //fix direction and increase radius
        for(int d = 0; d < directions.length;d++){
            for(int rad = 1; rad <= n;rad++){
                int x = r + rad *(directions[d][0]);
                int y = c + rad *(directions[d][1]);

                if(x >= 0 && y >= 0 && x < n && y < n){
                    if(arr[x][y]){
                        return false;
                    }
                }else{
                    break;
                }
            }
        }
        return true;
    }



    public static void main(String [] args){

        boolean[][] arr = new boolean[4][4];
        System.out.println(NQueenPermutationS2d(arr, 4, 0,  ""));

    }
}

/*
(0,1) (1,3) (2,0) (3,2)
(0,1) (1,3) (3,2) (2,0)
(0,1) (2,0) (1,3) (3,2)
(0,1) (2,0) (3,2) (1,3)
(0,1) (3,2) (1,3) (2,0)
(0,1) (3,2) (2,0) (1,3)
(0,2) (1,0) (2,3) (3,1)
(0,2) (1,0) (3,1) (2,3)
(0,2) (2,3) (1,0) (3,1)
(0,2) (2,3) (3,1) (1,0)
(0,2) (3,1) (1,0) (2,3)
(0,2) (3,1) (2,3) (1,0)
(1,0) (0,2) (2,3) (3,1)
(1,0) (0,2) (3,1) (2,3)
(1,0) (2,3) (0,2) (3,1)
(1,0) (2,3) (3,1) (0,2)
(1,0) (3,1) (0,2) (2,3)
(1,0) (3,1) (2,3) (0,2)
(1,3) (0,1) (2,0) (3,2)
(1,3) (0,1) (3,2) (2,0)
(1,3) (2,0) (0,1) (3,2)
(1,3) (2,0) (3,2) (0,1)
(1,3) (3,2) (0,1) (2,0)
(1,3) (3,2) (2,0) (0,1)
(2,0) (0,1) (1,3) (3,2)
(2,0) (0,1) (3,2) (1,3)
(2,0) (1,3) (0,1) (3,2)
(2,0) (1,3) (3,2) (0,1)
(2,0) (3,2) (0,1) (1,3)
(2,0) (3,2) (1,3) (0,1)
(2,3) (0,2) (1,0) (3,1)
(2,3) (0,2) (3,1) (1,0)
(2,3) (1,0) (0,2) (3,1)
(2,3) (1,0) (3,1) (0,2)
(2,3) (3,1) (0,2) (1,0)
(2,3) (3,1) (1,0) (0,2)
(3,1) (0,2) (1,0) (2,3)
(3,1) (0,2) (2,3) (1,0)
(3,1) (1,0) (0,2) (2,3)
(3,1) (1,0) (2,3) (0,2)
(3,1) (2,3) (0,2) (1,0)
(3,1) (2,3) (1,0) (0,2)
(3,2) (0,1) (1,3) (2,0)
(3,2) (0,1) (2,0) (1,3)
(3,2) (1,3) (0,1) (2,0)
(3,2) (1,3) (2,0) (0,1)
(3,2) (2,0) (0,1) (1,3)
(3,2) (2,0) (1,3) (0,1)
48
 */
