class Pyramid{
    public static void main(String args[]){
        int n = 13;
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i+j>=n-1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int k=n; k<2*n-1; k++)
            {
                if(k-i < n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}