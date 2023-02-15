package Homework;
public class program {
    public static void main(String[] args) {
    int n = 4;
    print(n, calc(n));
    } 
    
    public static int calc(int n){
        int result = 0;
        for (int i = 1; i<=n; i++ ){
            result+=i;
        }
        return result;
    }

    public static void print(int n, int s){
        System.out.println(String.format("Треугольное число %d = %d", n, s));
    }
}
