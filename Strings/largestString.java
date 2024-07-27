package Strings;

public class largestString {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i])<0){//str1.compareTo(str2) case sensentive
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
}
