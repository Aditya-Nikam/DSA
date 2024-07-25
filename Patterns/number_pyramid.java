package Code.Patterns;

//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
public class number_pyramid {
    private static void print_number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print_number_pyramid(5);
    }

}
