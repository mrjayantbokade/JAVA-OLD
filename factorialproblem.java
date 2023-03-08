import java.util.Scanner;

public class factorialproblem {

    public static   void factorial(int num){
        if(num<=0){
            System.out.println("Invalid number");
            return;
        }

            int fac =1;

            for(int i=num; i>=1; i--){
                fac = fac *i;
            }
            System.out.println(fac);
            return;


        }
        
       
        
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for factorial");

        int num = sc.nextInt();
        factorial(num);

    }
}
