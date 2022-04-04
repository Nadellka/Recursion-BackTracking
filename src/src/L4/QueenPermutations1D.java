package L4;
//This would not require boxNo
public class QueenPermutations1D {
    public static int queenPermutation(boolean [] arr, int queens,int queensPlaced,String psf){

        if(queensPlaced == queens ){
            System.out.println(psf);
            return 1;
        }
        int count =0 ;

        for(int i = 0; i < arr.length;i++){
            if(!arr[i]){
                arr[i] = true;
                count += queenPermutation(arr,queens,queensPlaced+1,psf + "q" + queensPlaced + "b" + i + " ");
                arr[i] = false;
            }

        }

        return count;

    }


    public static void main(String [] args){

        boolean[] arr = new boolean[6];
        System.out.println(queenPermutation(arr,3,0,""));
    }
}

/*
OUTPUT:

q0b0 q1b1 q2b2
q0b0 q1b1 q2b3
q0b0 q1b1 q2b4
q0b0 q1b1 q2b5
q0b0 q1b2 q2b1
q0b0 q1b2 q2b3
q0b0 q1b2 q2b4
q0b0 q1b2 q2b5
q0b0 q1b3 q2b1
q0b0 q1b3 q2b2
q0b0 q1b3 q2b4
q0b0 q1b3 q2b5
q0b0 q1b4 q2b1
q0b0 q1b4 q2b2
q0b0 q1b4 q2b3
q0b0 q1b4 q2b5
q0b0 q1b5 q2b1
q0b0 q1b5 q2b2
q0b0 q1b5 q2b3
q0b0 q1b5 q2b4
q0b1 q1b0 q2b2
q0b1 q1b0 q2b3
q0b1 q1b0 q2b4
q0b1 q1b0 q2b5
q0b1 q1b2 q2b0
q0b1 q1b2 q2b3
q0b1 q1b2 q2b4
q0b1 q1b2 q2b5
q0b1 q1b3 q2b0
q0b1 q1b3 q2b2
q0b1 q1b3 q2b4
q0b1 q1b3 q2b5
q0b1 q1b4 q2b0
q0b1 q1b4 q2b2
q0b1 q1b4 q2b3
q0b1 q1b4 q2b5
q0b1 q1b5 q2b0
q0b1 q1b5 q2b2
q0b1 q1b5 q2b3
q0b1 q1b5 q2b4
q0b2 q1b0 q2b1
q0b2 q1b0 q2b3
q0b2 q1b0 q2b4
q0b2 q1b0 q2b5
q0b2 q1b1 q2b0
q0b2 q1b1 q2b3
q0b2 q1b1 q2b4
q0b2 q1b1 q2b5
q0b2 q1b3 q2b0
q0b2 q1b3 q2b1
q0b2 q1b3 q2b4
q0b2 q1b3 q2b5
q0b2 q1b4 q2b0
q0b2 q1b4 q2b1
q0b2 q1b4 q2b3
q0b2 q1b4 q2b5
q0b2 q1b5 q2b0
q0b2 q1b5 q2b1
q0b2 q1b5 q2b3
q0b2 q1b5 q2b4
q0b3 q1b0 q2b1
q0b3 q1b0 q2b2
q0b3 q1b0 q2b4
q0b3 q1b0 q2b5
q0b3 q1b1 q2b0
q0b3 q1b1 q2b2
q0b3 q1b1 q2b4
q0b3 q1b1 q2b5
q0b3 q1b2 q2b0
q0b3 q1b2 q2b1
q0b3 q1b2 q2b4
q0b3 q1b2 q2b5
q0b3 q1b4 q2b0
q0b3 q1b4 q2b1
q0b3 q1b4 q2b2
q0b3 q1b4 q2b5
q0b3 q1b5 q2b0
q0b3 q1b5 q2b1
q0b3 q1b5 q2b2
q0b3 q1b5 q2b4
q0b4 q1b0 q2b1
q0b4 q1b0 q2b2
q0b4 q1b0 q2b3
q0b4 q1b0 q2b5
q0b4 q1b1 q2b0
q0b4 q1b1 q2b2
q0b4 q1b1 q2b3
q0b4 q1b1 q2b5
q0b4 q1b2 q2b0
q0b4 q1b2 q2b1
q0b4 q1b2 q2b3
q0b4 q1b2 q2b5
q0b4 q1b3 q2b0
q0b4 q1b3 q2b1
q0b4 q1b3 q2b2
q0b4 q1b3 q2b5
q0b4 q1b5 q2b0
q0b4 q1b5 q2b1
q0b4 q1b5 q2b2
q0b4 q1b5 q2b3
q0b5 q1b0 q2b1
q0b5 q1b0 q2b2
q0b5 q1b0 q2b3
q0b5 q1b0 q2b4
q0b5 q1b1 q2b0
q0b5 q1b1 q2b2
q0b5 q1b1 q2b3
q0b5 q1b1 q2b4
q0b5 q1b2 q2b0
q0b5 q1b2 q2b1
q0b5 q1b2 q2b3
q0b5 q1b2 q2b4
q0b5 q1b3 q2b0
q0b5 q1b3 q2b1
q0b5 q1b3 q2b2
q0b5 q1b3 q2b4
q0b5 q1b4 q2b0
q0b5 q1b4 q2b1
q0b5 q1b4 q2b2
q0b5 q1b4 q2b3
120
 */

