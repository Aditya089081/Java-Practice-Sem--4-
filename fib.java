public class fib {
    public static int a = 0;
    public static int fibo(int n){
        a++;
        if(n<=2){
            return n;
        }else if(n==3){
            return 4;
        }else{
            return fibo(n-1)+fibo(n-2)+fibo(n-3);
        }
        
    }
    public static void main(String []arg){
        int n = 5;
        fibo(n);
        System.out.print(a);
    }
}
