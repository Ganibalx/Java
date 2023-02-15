public class p2 {
    public static void main(String[] args) {
        int[] array = generation();
        print(array);
    }

    public static int[] generation(){
        int[] result = new int[5];
        for (int i = 0; i<result.length; i++){
            result[i] = (int) ( Math.random() * 11 );
        }
        return result;
    }

    public static void print(int[] array){
        int[]result = new int[array.length];
        int j = 0;
        for (int i = 0; i<array.length; i++){            
            if (array[i]%2==0){
                result[j]=array[i];
                j ++;
            };
        } 
        for (int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }       
    }
}
