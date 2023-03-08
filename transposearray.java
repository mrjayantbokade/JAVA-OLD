import java.util.Scanner;

public class transposearray {
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int alok[][] = new int [n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
         alok [i][j] = sc.nextInt();   
        }
    }
    
}
