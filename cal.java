import java.util.*;

public class cal {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a =  sc.nextInt();

    System.out.println("Enter the value of b");
    int b =  sc.nextInt();

    System.out.println("enter the operation u want to perform on these two numbers");
    System.out.println("1. addition 2.subtraction 3.multiple 4.division 5.modulas");
    
    int x = sc.nextInt();
    switch (x) {
        case 1:    System.out.println("the addition of a and b is "+ (a+b));
            break;
        case 2:       System.out.println("the subtraction of a and b is "+ (a-b));

            break;
        case 3:    System.out.println("the multiple of a and b is "+ (a*b));
            break;
        case 4:    System.out.println("the division of a and b is "+ (a/b));
            break;
        case 5:   System.out.println("the modulas of a and b is "+ (a%b));
            break;

    
        default:System.out.println("invalid operation");
            break;
    }

   
    
    
    }

}
