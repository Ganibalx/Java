public class p1{
    public static void main(String[] args) {
        int n = 10;
        char c1 = 'h';
        char c2 = '1';
        System.out.println(met(n, c1, c2).toString());

    }

    private static StringBuilder met(int n, char c1, char c2){
        StringBuilder result = new StringBuilder(); 
        for(int i = 0; i<n/2; i++){
            result.append(c1).append(c2);
        }
        return result;
    }
}