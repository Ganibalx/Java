public class p3 {
    public static void main(String[] args) {
        String vhod = "12121";
        System.out.println(calc(vhod)); 
    }

    private static boolean calc(String vhod){
        StringBuilder obr = new StringBuilder();        
        boolean result = false;
        for(int i = vhod.length()-1; i>=0; i--){
            obr.append(vhod.charAt(i));                    
            }
        if (obr.toString().equals(vhod)){
            result = true;
        }
        return result;
    }
}
