import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class p1 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(p1.class.getName());
        FileHandler fh = new FileHandler("p1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        logger.info("печатаем исходный массив");
        printData(data);
        logger.info("запуск сортировки");
        sorted(data, logger); 
        logger.info("печатаем получившийся массив");
        printData(data);   
    } 

    private static void sorted(int[] data, Logger logger) {
        logger.info("создаем левый массив длинной "+ data.length / 2);
        int[] leftdata = new int[data.length / 2];
        int[] rightdata = new int[data.length - leftdata.length];     
        logger.info("создаем правый массив длинной "+ rightdata.length);
        logger.info("запускаем цикл для заполнения новых массивов");
        for (int i = 0; i < data.length; i++) { //запускаем цикл для заполнения новых массивов
            if (i < leftdata.length) {
                leftdata[i] = data[i];
                logger.info("элемент " + i + " = " + leftdata[i] +"записан в левый массив");    
            } else {
                rightdata[i - leftdata.length] = data[i];
                logger.info("элемент " + i + " = " + data[i] +"записан в правый массив");     
            }
        }

        if (rightdata.length > 1) { //проверяем длинну получившихся массивов
            logger.info("Проверка на длинну массивов");
            sorted(leftdata, logger); //Если длина меньше 1 то делимся еще
            sorted(rightdata, logger); //Если длина меньше 1 то делимся еще
        }
        int leftId = 0; //определяем переменные для счетчика
        int rightId = 0; //определяем переменные для счетчика
    
        for (int i = 0; i < data.length; i++) { //запускаем цикл для заполения массива
            if (leftId == leftdata.length && rightId < rightdata.length) {
                logger.info("элемент " + rightId + " = " + rightdata[rightId] +"записать в итог");
                data[i] = rightdata[rightId++];    
            } else if (rightId == rightdata.length && leftId < leftdata.length) {
                logger.info("элемент " + leftId + " = " + leftdata[leftId] +"записать в итог");
                data[i] = leftdata[leftId++];    
                } else {
                    if (leftdata[leftId] < rightdata[rightId]) {
                        logger.info("элемент " + leftId + " = " + leftdata[leftId] +"записать в итог");
                        data[i] = leftdata[leftId++];    
                    } else {
                        logger.info("элемент " + rightId + " = " + rightdata[rightId] +"записать в итог");
                        data[i] = rightdata[rightId++];    
                    }
                }
        }     
    }
    
    private static void printData(int[] data) {
    System.out.print("{");
    for (int i=0; i<data.length;i++){
    System.out.print(data[i]+" ");
    }
    System.out.println("}");
    }
}
