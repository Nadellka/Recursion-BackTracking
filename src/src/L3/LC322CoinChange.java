package L3;
//https://leetcode.com/problems/coin-change/
public class LC322CoinChange {
    public static int coinChange(int[] coins, int amount) {

        int result = helper(coins,amount);
        return result != (int)1e9 ? result : -1 ;

    }

    private static int helper(int[] coins, int amount){
        //Base case
        if(amount == 0){
            return 0;
        }
        int minimumCoins = (int) 1e9 ;
        for(int i = 0; i < coins.length; i++){
            if(amount - coins[i] >= 0){
                minimumCoins = Math.min(minimumCoins, helper(coins,amount - coins[i]) + 1);
            }
        }

        return minimumCoins;
    }

    public static void main(String [] args){

        int[] coins = {1,2,5};
        System.out.println(coinChange (coins,11));
    }
    //Output : 3
}
