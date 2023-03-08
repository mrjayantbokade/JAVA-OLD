import java.util.Scanner;

public class newwww {

    public static void iloveyou(String name){

        System.out.println(name);

    }



    public static void main(String[] args){

        System.out.println("Enter your name below: ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        iloveyou(name);
    }
}
