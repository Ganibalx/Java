public class p1 {
    public static void main(String[] args) {
       int [] ar1 = new int[] {1,2,3,4};
       int [] ar2 = new int[5];
       ar2 = ar1;
       for(int i=0; i<ar2.length;i++){
        System.out.println(ar2[i]);
       } 
        /*String msg = "Привет!";
        if (args != null){
            if (args.length>0){
                msg = msg + ", " + args[0];
            }
        }
        System.out.println(msg);*/
    }
}
