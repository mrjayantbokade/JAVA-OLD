import java.util.Scanner;

public class eve {
 


    public static void evenodd(int num){
        if (num%2==0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args){
        System.out.println("Enter the number for checking even or odd numbers");
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        evenodd(a);
    }
}
