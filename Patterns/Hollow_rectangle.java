package Patterns;
// *****
// *   *
// *   *
// *****
class Hollow_rectangle {
    public static void main(String[] args) {
       hollow_rectangle(4,5);
    }
    public static void hollow_rectangle(int row, int col){
        
        for(int r=1;r<=row;r++){
            for(int c=1;c<=col;c++){
                if( r==1 || r==4 || c==1 || c==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
