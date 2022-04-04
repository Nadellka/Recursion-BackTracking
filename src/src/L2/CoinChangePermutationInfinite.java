package L2;

public class CoinChangePermutationInfinite {

    public static int coinChangePermutation_InfiniteSupply(int [] coins, int target, String psf){

        //base case
        if(target == 0){
            System.out.println(psf);
            return 1;
        }
        int count =0;
        for(int i = 0; i < coins.length; i++){
            if(target - coins[i] >= 0){
                count += coinChangePermutation_InfiniteSupply(coins,target-coins[i],psf + coins[i] + " ");
            }
        }

        return count;

    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangePermutation_InfiniteSupply(coins,10,""));
    }
}

/*
OUTPUT:
2 2 2 2 2
2 2 3 3
2 3 2 3
2 3 3 2
2 3 5
2 5 3
3 2 2 3
3 2 3 2
3 2 5
3 3 2 2
3 5 2
3 7
5 2 3
5 3 2
5 5
7 3
16
 */
