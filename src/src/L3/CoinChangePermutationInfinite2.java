package L3;
//Pick and NonPick Method, Subsequence Method
public class CoinChangePermutationInfinite2 {
    public static int coinChangePermutation_InfiniteSupply2(int [] coins, int target,int idx, String psf){

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
            if(target - coins[idx] >= 0){
                count += coinChangePermutation_InfiniteSupply2(coins,target-coins[idx], 0,psf + coins[idx] + " ");
            }
        //Not Pick
        count += coinChangePermutation_InfiniteSupply2(coins,target, idx+1,psf);


        return count;

    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangePermutation_InfiniteSupply2(coins,10,0,""));
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
