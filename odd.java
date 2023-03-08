import java.util.*;
class odd{

    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number u want:- ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The number is even");


        }
        else{
            System.out.println("The number is odd");
        }
    }
}