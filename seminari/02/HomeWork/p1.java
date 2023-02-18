package HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;

public class p1 {
    public static void main(String[] args) throws Exception {
        String line = "select * from students where ";
        String[] array = parse(read());
        String result = otvet(line, array);
        System.out.println(result);       
    }

    private static String read() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("p1.json")); 
        String result = br.readLine();         
        br.close();
        return result;
    }

    private static String[] parse(String json){
        StringBuilder line = new StringBuilder();
        for(int i = 0; i< json.length(); i++){
            if (json.charAt(i)!= '{' && json.charAt(i)!= '}' && json.charAt(i)!= ' ' && json.charAt(i)!= '"'){
                line.append(json.charAt(i));
            }
        } 
        String[] result = line.toString().split(",");        
        return result;        
    }

    private static String otvet(String line, String[] array){
        StringBuilder result = new StringBuilder();
        result.append(line);
        String[] a = new String[2];
        int u = 0;
        for (String i : array){
            a = i.split(":");
            if (!a[1].equals("null")){
                if (u!=0) result.append(" and ");
                result.append(a[0]);
                result.append(" = ");
                result.append("'");
                result.append(a[1]);
                result.append("'");
                u++;
            }
        }
        return result.toString();
    }
}
