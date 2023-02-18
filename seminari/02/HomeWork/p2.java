package HomeWork;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class p2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(p2.class.getName());
        FileHandler fh = new FileHandler("p2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        
        int array[] = {1, 5, 10, 3, 6, 2, 4, 9, 8, 7};
        logger.info("печатаем исходный массив");
        print(array);
        logger.info("сортируем");
        sort(array);
        logger.info("печатаем отсортированный массив");
        print(array);
    }
    
    private static void sort(int[] array){  
        for (int i = 1; i<array.length; i++){
            for (int j = 0, max; j<array.length-i; j++){
                if (array[j]>array[j+1]){
                    max = array[j];
                    array[j] = array[j+1];
                    array[j+1] = max; 
                }
            }
        }        
    }

    private static void print(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.print(array[i]+" ");        
        }        
    }
}
