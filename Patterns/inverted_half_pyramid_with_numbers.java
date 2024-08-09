package Patterns;
// 12345
// 1234
// 123
// 12
// 1
public class inverted_half_pyramid_with_numbers {
    private static void print_inverted_half_pyramid_with_numbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_inverted_half_pyramid_with_numbers(5);
    }
}
