package Strings;

public class shortestPath {
    private static double getShortestPath(String path){
        int x=0,y=0;
        for(int i = 0; i<path.length();i++){
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        return Math.sqrt(x*x+y*y);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
