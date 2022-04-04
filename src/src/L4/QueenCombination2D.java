package L4;

public class QueenCombination2D {
    public static int queenCombinations2d(boolean[][] arr, int queens, int queensPlaced, int boxNo, String psf) {

        if (queensPlaced == queens) {
            System.out.println(psf);
            return 1;
        }
        int count = 0;
        int n = arr.length;
        for (int i = boxNo; i < n*n; i++) {
            int r = i/n ;
            int c = i%n ;
            count += queenCombinations2d(arr, queens, queensPlaced + 1, i + 1, psf + "(" + r + ","+ c + ")");
        }

        return count;

    }


    public static void main(String[] args) {

        boolean[][] arr = new boolean[4][4];
        System.out.println(queenCombinations2d(arr, 4, 0, 0, ""));
    }
}
