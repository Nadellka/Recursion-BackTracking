package L3;
/*

https://leetcode.com/problems/combination-sum/
 */
import java.util.ArrayList;
import java.util.List;

public class LC39CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates,target,0,result,temp);
        return result;
    }

    public static void helper(int[] candidates, int target,int idx, List<List<Integer>> result,List<Integer> temp){

        if(target == 0 || idx == candidates.length){
            if(target == 0 ){
                List<Integer> res = new ArrayList<>(temp);
                result.add(res);
               // return ;
            }
            return ;
        }

        //pick

        if(target-candidates[idx] >= 0){

            temp.add(candidates[idx]);
            helper(candidates,target-candidates[idx],idx,result,temp);
            temp.remove(temp.size()-1);
        }
        //not pick
        helper(candidates,target,idx+1,result,temp);


    }

    public static void main(String [] args){

        int[] candidates = {2,3,6,7};
        System.out.println(combinationSum(candidates,7));
    }

}

