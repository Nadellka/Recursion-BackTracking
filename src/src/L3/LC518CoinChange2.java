package L3;
//https://leetcode.com/problems/coin-change-2/
//Gives Time Limit Exceeded
public class LC518CoinChange2 {

    public static int change(int amount, int[] coins) {
        return coinChangeCombination_InfiniteSupply(coins,amount,0);
    }

    public static int coinChangeCombination_InfiniteSupply(int [] coins, int target,int idx){
        //base case
        if(target == 0){
            return 1;
        }
        int count =0;
        for(int i = idx; i < coins.length; i++){
            if(target - coins[i] >= 0){
                count += coinChangeCombination_InfiniteSupply(coins,target-coins[i],i);
            }
        }

        return count;
    }

    public static void main(String [] args){

        int[] coins = {1,2,5};
        System.out.println(change (5,coins));
    }
}

