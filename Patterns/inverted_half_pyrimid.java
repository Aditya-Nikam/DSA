package Code.Patterns;
//     *
//    **
//   ***
//  ****
public class inverted_half_pyrimid {

    private static void print_inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //             System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        print_inverted_half_pyramid(4);
    }
}
