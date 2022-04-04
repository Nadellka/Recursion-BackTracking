package L3;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/permutations/
public class LC46Permutations {
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,result,temp);
        return result;
    }

    private static int helper(int[] nums,List<List<Integer>> result,List<Integer> temp){
        if(temp.size() == nums.length){
            List<Integer> baseResult = new ArrayList<>(temp);
            result.add(baseResult);
            return 1;
        }

        int count = 0;

        for(int i = 0; i< nums.length;i++){
            if(nums[i] != -11){


                int val = nums[i];
                //marking the coin as used
                nums[i] = -11;
                temp.add(val);
                count += helper(nums,result,temp);
                //make it available for use again
                nums[i] = val ;

                temp.remove(temp.size() - 1);
            }

        }

       // System.out.println(count);

        return count;
    }

    public static void main(String [] args){

        int[] candidates = {2,3,6,7};
        System.out.println(permute(candidates));
    }

    /*

    OUTPUT:

    [[2, 3, 6, 7], [2, 3, 7, 6], [2, 6, 3, 7], [2, 6, 7, 3], [2, 7, 3, 6], [2, 7, 6, 3],
    [3, 2, 6, 7], [3, 2, 7, 6], [3, 6, 2, 7], [3, 6, 7, 2], [3, 7, 2, 6], [3, 7, 6, 2],
    [6, 2, 3, 7], [6, 2, 7, 3], [6, 3, 2, 7], [6, 3, 7, 2], [6, 7, 2, 3], [6, 7, 3, 2],
    [7, 2, 3, 6], [7, 2, 6, 3], [7, 3, 2, 6], [7, 3, 6, 2], [7, 6, 2, 3], [7, 6, 3, 2]]

     */

}
