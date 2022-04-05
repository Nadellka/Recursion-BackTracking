package L4;

public class QueenCombinations1D {

    public static int queenCombinations(boolean [] arr, int queens,int queensPlaced,int boxNo,String psf){

        if(queensPlaced == queens ){
            System.out.println(psf);
            return 1;
        }
        int count =0 ;

        for(int i = boxNo; i < arr.length;i++){

            count += queenCombinations(arr,queens,queensPlaced+1,i+1,psf + "q" + queensPlaced + "b" + i + " ");
        }

        return count;

    }


    public static void main(String [] args){

        boolean[] arr = new boolean[6];
        System.out.println(queenCombinations(arr,3,0,0,""));
    }
}

/*

OUTPUT:
q0b0q1b1q2b2
q0b0q1b1q2b3
q0b0q1b1q2b4
q0b0q1b1q2b5
q0b0q1b2q2b3
q0b0q1b2q2b4
q0b0q1b2q2b5
q0b0q1b3q2b4
q0b0q1b3q2b5
q0b0q1b4q2b5
q0b1q1b2q2b3
q0b1q1b2q2b4
q0b1q1b2q2b5
q0b1q1b3q2b4
q0b1q1b3q2b5
q0b1q1b4q2b5
q0b2q1b3q2b4
q0b2q1b3q2b5
q0b2q1b4q2b5
q0b3q1b4q2b5
20
 */
