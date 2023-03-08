import java.util.Scanner;

public class gcd {
    public static int printgcd(int a, int b){

        int greatcd = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0 && b%i==0){
              greatcd=i;
            }
          }return greatcd;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the first number");

        int a =  sc.nextInt();
 
        System.out.println("Enter the second number");
        int b =  sc.nextInt();
       

        System.out.println( "GCD = "+printgcd(a, b));
     
    }
}
