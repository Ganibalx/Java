public class p1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2025;
        System.out.println(calc(a, b));
    }

    private static int calc(int a, int b){
        if (a>b) return 0;
        else{
            if (a==b) return 1;
            else{
                if (a*2<=b) return (calc(a*2, b) + calc (a+1, b));
                else return calc(a+1, b);
            }
        }
    }
}
