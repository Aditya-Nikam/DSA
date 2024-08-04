package Strings.leetcode;

public class reversewordsinastring {
    
    public static String reverseWords(String s) {
        String s1 = s.replaceAll("\\s+", " ").trim();
        StringBuffer sb = new StringBuffer("");
        String[] words = s1.split(" ");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWords(str));
    }
}
