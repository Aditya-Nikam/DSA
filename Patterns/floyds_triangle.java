package Code.Patterns;
//  1 
//  2 3
//  4 5 6
//  7 8 9 10
public class floyds_triangle {
    private static void print_floyds_triangle(int n){
        int counter=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++counter + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print_floyds_triangle(5);
    }
}
