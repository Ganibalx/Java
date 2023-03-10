public class p1 {
    public static void main(String[] args) {
    int[][] array = karta();
    print(array);     
    }

    private static int[][] karta(){ 
        int[][] array = {{-1,-1,-1,-1,-1,-1,-1},
                         {-1, 0, 0, 0, 0, 0,-1},
                         {-1, 1,-1, 0, 0,20,-1},
                         {-1, 0,-1,-1,-1, 0,-1},
                         {-1, 0,-1, 0,20, 0,-1},
                         {-1, 0, 0, 0, 0, 0,-1},
                         {-1,-1,-1,-1,-1,-1,-1}};
        return array; 
    }

    private static void print(int[][] array){        
        for(int[] i: array){
            for(int j: i){                 
                System.out.print(j+"\t");                
            }
            System.out.println();
        }
    }

    static void poisk(int[][] array){
        
    }
}

