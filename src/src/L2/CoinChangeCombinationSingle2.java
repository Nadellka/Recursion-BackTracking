package L2;
//Pick and NonPick method
public class CoinChangeCombinationSingle2 {
    public static int coinChangeCombinationSubSequenceMethod(int [] coins, int target,int idx, String psf){
        //base case
        if(target == 0 || idx == coins.length){
            if(target == 0){
                System.out.println(psf);
                return 1;
            }
            return 0;

        }
        int count =0;

            if(target - coins[idx] >= 0){
                //pick
                count += coinChangeCombinationSubSequenceMethod(coins,target-coins[idx],idx+1,psf + coins[idx] + " ");
            }
            //Non Pick
             count += coinChangeCombinationSubSequenceMethod(coins,target,idx+1,psf );


        return count;
    }

    public static void main(String [] args){

        int[] coins = {2,3,5,7};
        System.out.println(coinChangeCombinationSubSequenceMethod(coins,10,0,""));
    }
}
/*
OUTPUT:

2 3 5
3 7
2
 */