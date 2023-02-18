public class p2 {
    public static void main(String[] args) {
        String vhod = "aaaabbbcdd";
        System.out.println(calc(vhod));
    }

    private static String calc(String vhod){
        StringBuilder result = new StringBuilder();
        int j = 0;
        char a = '0';
        for(int i = 0; i<vhod.length(); i++){
            if (a == '0'){
                a = vhod.charAt(i);
                j = 1;
            }
            else{
                if (vhod.charAt(i) == a){
                   j++;
                } 
                else{
                    result.append(a).append(j);
                    j=1;
                    a=vhod.charAt(i);
                }
            }
        }
        result.append(a).append(j);
        return result.toString();
    }
}
