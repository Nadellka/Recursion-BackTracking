package L3;

public class CoinChangePermutationSingle2 {
    public static int coinChangePermutation_Single2(int [] coins, int target,int idx, String psf){

        //base case
        if(target == 0 || idx == coins.length){
            if(target == 0){
                System.out.println(psf);
                return 1;
            }
            return 0;
        }
        int count =0;
        //pick
        if(coins[idx] > 0 && target - coins[idx] >= 0){
            int val = coins[idx];
            //while using the coin, make it marked by making it negative
            coins[idx] = - coins[idx];
            count += coinChangePermutation_Single2(coins,target-val, 0,psf + val + " ");
            coins[idx] = - coins[idx];
        }
        //Not Pick
        count += coinChangePermutation_Single2(coins,target, idx+1,psf);


        return count;

    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangePermutation_Single2(coins,10,0,""));
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
