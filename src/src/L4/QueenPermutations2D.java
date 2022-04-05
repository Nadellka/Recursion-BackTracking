package L4;

public class QueenPermutations2D {
    public static int queenPermutationS2d(boolean [][] arr, int queens,int queensPlaced,String psf){

        if(queensPlaced == queens ){
            System.out.println(psf);
            return 1;
        }
        int count =0 ;
        int n = arr.length;
        for(int i = 0; i < n*n;i++){
            int r = i /n ;
            int c = i %n ;
            if(!arr[r][c]){
                arr[r][c] = true;
                count += queenPermutationS2d(arr,queens,queensPlaced+1,psf + "(" + r + "," + c + ") ");
                arr[r][c] = false;
            }

        }

        return count;

    }


    public static void main(String [] args){

        boolean[][] arr = new boolean[4][4];
        System.out.println(queenPermutationS2d(arr, 4, 0,  ""));

    }
}

