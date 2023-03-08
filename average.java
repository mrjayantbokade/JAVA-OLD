import java.util.*;

public class average {

    public static void printAverage(int a, int b, int c){
        int average =  (a+b+c)/3;
        System.out.println("The average of these three numbers are "+average);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();

        printAverage(num1, num2, num3);

    }
}
