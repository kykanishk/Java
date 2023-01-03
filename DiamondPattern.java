public class DiamondPattern {
    public static void main(String[] args) {
        int n = 17;
        for(int i=0; i<n*2-1; i++){
            for(int j=0; j<n*2-1; j++){
                if(i+j==n-1 || i-j == n-1 || j-i == n-1 || (i+j)==n*2+n-3) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
