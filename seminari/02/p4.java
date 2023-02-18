import java.io.File;
import java.nio.file.Path;

import javax.swing.border.EmptyBorder;

/*Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
оно должно записаться в лог-файл. */
public class p4 {
    public static void main(String[] args) {        
        direct("D:\\");
    }

    private static String[] direct(String put){
        String[] line = new String[] {"empty"};
        File file = new File(put);
        try { 
            line = file.list();
            for(String i : line){
                System.out.println(i);
            }            
        } catch (Exception e) { 
            System.out.println("Операция над списком не выполнена");
            System.out.println(e);
        }       
        return line;      
    }
}
