import java.util.Scanner;

public class twodarray {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int row = sc.nextInt();
        System.out.println("enter the no. of rows");
        int col = sc.nextInt();

        int numbers[] [] = new int[row] [col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                numbers[i] [j]= sc.nextInt();

            }
        }
        int x = sc.nextInt();

        for(int i=0; i<numbers.hashCode(); i++){
            for(int j=0; j<col; j++){
                

                if(numbers[i] [j] == x){
                    System.out.println("find "+ x + " at position "+ i +" "+ j);

                }
            }
        }

    }
}
