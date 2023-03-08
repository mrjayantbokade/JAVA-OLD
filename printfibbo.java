public class printfibbo {
    public static void printFib(int x, int y, int n){
        if(n==2){
            
            return;
        }
        int z = x+y;
        System.out.println(z);
        printFib(y, z, n-1);

    }
    public static void main(String args[]){
        int x=0;
        int y=1;
        System.out.println(x);
        System.out.println(y);
        printFib(x, y, 7);
        
    }
}
