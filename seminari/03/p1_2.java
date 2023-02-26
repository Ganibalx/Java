public class p1_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 12;
        int c = 1; //+1
        int d = 2; //*2
        int[] way = new int [b+1];
        
        way[a] = 1;

        for (int i = a + c; i <= b; i++){
            way[i] = i % d == 0? way[i-c] + way[i/d]:way[i-c];
        }
        System.out.println(way[b]);
    }
}
