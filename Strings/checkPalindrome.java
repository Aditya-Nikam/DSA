package Strings;

public class checkPalindrome {
    private static boolean isPalindeome(String str){
        int half=str.length()/2;
        for(int i=0;i<=half;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindeome(str));

    }
}
