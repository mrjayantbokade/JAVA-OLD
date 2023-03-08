import java.util.Scanner;

public class mul{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=0; i<=n; i++){
        int mull=1;
        mull= mull*i;
        System.out.println(mull);
    }
}
