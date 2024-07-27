package Strings;

public class convertToUpperCase {
    private static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                char ch1 = Character.toUpperCase(str.charAt(i+1)); 
                i++;
                sb.append(ch1);
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(toUpperCase("hello world "));
    }
    
}
