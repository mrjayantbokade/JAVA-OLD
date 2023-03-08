import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for last fibonacci number");
        int n = sc.nextInt();

        int x=0, y=1,z=0;
        
        for(int i=1; i<=n; i++)
        {
            while(z<=n){
         
                System.out.println(z);

            x=y;
            y=z;
            z=x+y;
            }
        }
        }
    }

