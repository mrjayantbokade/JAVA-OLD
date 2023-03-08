public class numpyramid {
    public static void main(String[] args){
        int num=1;
        int n=5;

        for(int i=1; i<=n; i++){
            
            int space=n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(num+"  ");
                
            }
            num++;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            System.out.println();
           
        }
    }
}
