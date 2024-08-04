package Strings.leetcode;

public class longestCommenPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String prefix = strs[0];
        for(int i=0;i<strs.length-1;i++){
            String str2=strs[i+1];
            int len = (prefix.length()<str2.length())?prefix.length():str2.length();
            int count = 0 ;
            for(int j=0;j<len;j++){
                if(prefix.charAt(j)==str2.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            prefix=(prefix.substring(0, count));
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println(longestCommonPrefix(strs));
    }

}
