package L2;

public class CoinChangeCombinationInfinite {
    public static int coinChangeCombination_InfiniteSupply(int [] coins, int target,int idx,String psf){
        //base case
        if(target == 0){
            System.out.println(psf);
            return 1;
        }
        int count =0;
        for(int i = idx; i < coins.length; i++){
            if(target - coins[i] >= 0){
                count += coinChangeCombination_InfiniteSupply(coins,target-coins[i],i,psf + coins[i] + " ");
            }
        }

        return count;
    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangeCombination_InfiniteSupply(coins,10,0,""));
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
