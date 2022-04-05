package L3;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LC17LetterCombinationsOfPhone {

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();

        String [] keyPad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        helper(digits,result,keyPad,0,"");

        return result;


    }
    public static int helper(String digits, List<String> result, String [] keyPad, int idx, String psf){

        if(idx == digits.length()){
            result.add(psf);
            return 1;
        }
        int count = 0;

        int charIdx = digits.charAt(idx) - '0'; // 49-48 = 1
        String code = keyPad[charIdx];

        for(int i = 0; i < code.length(); i++){

            count += helper(digits,result,keyPad,idx+1,psf + code.charAt(i));
        }
        return count;
    }

    public static void main(String [] args){


        System.out.println(letterCombinations("23"));
    }
}

