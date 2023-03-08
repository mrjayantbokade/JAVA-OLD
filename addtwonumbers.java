import java.util.Scanner;

public class addtwonumbers {




    public static int add(int a, int b){
        int sum=a+b;
        System.out.println("\n\nThe addition of these two numbers is "+ sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of first number below: ");
        int a;
         a= sc.nextInt();


        System.out.println("Enter the value of second number below:");
        int b= sc.nextInt();

        add(a,b);
    }
}
