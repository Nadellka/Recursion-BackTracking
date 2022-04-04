package L2;

public class CoinChangeCombinationSingle {
    public static int coinChangeCombination(int [] coins, int target,int idx, String psf){
        //base case
        if(target == 0){
            System.out.println(psf);
            return 1;
        }
        int count =0;
        for(int i = idx; i < coins.length; i++){
            if(target - coins[i] >= 0){
                count += coinChangeCombination(coins,target-coins[i],i+1,psf + coins[i] + " ");
            }
        }

        return count;
    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangeCombination(coins,10,0,""));
    }
}

/*
OUTPUT:
2 3 5
3 7
2
*/

