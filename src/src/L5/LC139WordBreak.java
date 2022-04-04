package L5;

import java.util.*;

//https://leetcode.com/problems/word-break/
public class LC139WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        //Add the words in given dictionary to a set
        Set<String> set = new HashSet<>();

        for(String str: wordDict){
            set.add(str);
        }

        return wordBreakHelper(s,"",set);

    }

    public static boolean wordBreakHelper(String str, String asf, Set<String> set) {
         if(str.length() == 0){
             System.out.println(asf);
             return true;
         }
        for(int len = 1; len <= str.length(); len++){
            String small = str.substring(0,len);
            if(set.contains(small)){
                if(wordBreakHelper(str.substring(len),asf+small+" ",set)){
                    return true;
                }
            }
        }

        return false;


    }

    public static void main(String [] args){
        String [] arr = {"leet","code"};
        String s = "leetcode";
        List<String> wordDict = Arrays.asList(arr);
        System.out.println(wordBreak(s,  wordDict) );
    }
}


/*

OUTPUT:

leet code
true

 */
