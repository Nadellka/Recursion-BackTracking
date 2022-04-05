package L3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/combination-sum-ii/
public class LC40CombinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); //sort to avoid duplicates
        List<List<Integer>>  result = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        helper(candidates,target,result,temp,0);
        return result;
    }

    private static int helper(int[] candidates, int target, List<List<Integer>>  result,List<Integer> temp,int idx){

        //Base case

        if(target == 0){
            List<Integer> base =new ArrayList<>(temp);
            result.add(base);
            return 1;
        }

        int count = 0;
        int prev = -1;

        for(int i = idx ; i < candidates.length; i++){
            if(prev != candidates[i] && target - candidates[i] >= 0){
                temp.add(candidates[i]);
                count += helper(candidates,target-candidates[i],result,temp,i+1);
                temp.remove(temp.size()-1);
                prev = candidates[i];
            }
        }

        return count;
    }

    public static void main(String [] args){

        int[] coins = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(coins,8));
    }
}

/*

OUTPUT:
[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
 */
