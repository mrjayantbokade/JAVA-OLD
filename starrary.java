import java.util.Scanner;

public class starrary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String names[] = new String[size];

        for(int i=0; i<size; i++){
            names [i] = sc.next();

        }
        
        for(int i=0; i<size; i++){

           System.out.print(names[i]+ " ");
        }
        
    }
}
