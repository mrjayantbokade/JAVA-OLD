import java.util.*;

public class tableo{
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for the table");
    int n =  sc.nextInt();
    int mul = 1;
    for(int i=1;i<=10;i++){
        mul=n*i;
        System.out.println(mul);
    }


    }
   
}
