package Code.Patterns;
// 1
// 01
// 101
// 0101
// 10101
public class zero_one_triangle {
    private static void print_zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j)%2==0)?"1":"0");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_zero_one_triangle(5);
    }
}
