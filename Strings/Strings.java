package Strings;
class Strings{
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "Aditya";
        printString(str);
    }
}