package L3;
//Pick and NonPick Method, Subsequence Method
public class CoinChangeCombinationInfinite2 {
    public static int coinChangeCombinationInfiniteSupply2(int [] coins, int target,int idx, String psf){

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
            //we can't pick from idx = 0 again as it's done in Permutation
            count += coinChangeCombinationInfiniteSupply2(coins,target-coins[idx], idx,psf + coins[idx] + " ");
        }
        //Not Pick
        count += coinChangeCombinationInfiniteSupply2(coins,target, idx+1,psf);


        return count;

    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangeCombinationInfiniteSupply2(coins,10,0,""));
    }
}

/*

OUTPUT:

2 2 2 2 2
2 2 3 3
2 3 5
3 7
5 5
5
 */

