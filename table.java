import java.util.Scanner;

public class table {



    public static void mul(int num){

        for(int i=1; i<=100; i++){
            int mul2=num*i;
            System.out.println(mul2);
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the number for table printing");
        int num= sc.nextInt();
        mul(num);
    }
}
