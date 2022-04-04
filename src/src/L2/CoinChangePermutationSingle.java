package L2;

public class CoinChangePermutationSingle {
    public static int coinChangePermutation(int [] coins, int target, String psf){


        //base case
        if(target == 0){
            System.out.println(psf);
            return 1;
        }
        int count =0;
        for(int i = 0; i < coins.length; i++){
            if(coins[i] > 0 && target - coins[i] >= 0){
                int val = coins[i];
                //while using the coin, make it marked by making it negative
                coins[i] = - coins[i];
                count += coinChangePermutation(coins,target-val,psf + val + " ");
                //while backtracking , make the coin positive again to make it available for other calls
                coins[i] = - coins[i];
            }
        }

        return count;

    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangePermutation(coins,10,""));
    }
}

/*

OUTPUT:
2 3 5
2 5 3
3 2 5
3 5 2
3 7
5 2 3
5 3 2
7 3
8
 */
