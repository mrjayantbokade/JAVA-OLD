public class floyd {
    public static void main(String[] args){
        int n=5;
        int num=1;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("1 0");
                num++;
           }System.out.println();
        }
    }
}
