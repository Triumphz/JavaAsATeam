public class Loop2_5 {
    public static void main(String[] args) {
        System.out.println("===== FIVE =====");
        System.out.format("พิมพ์%n---------X%n--------XX%n...%nXXXXXXXXXX 10 บรรทัด%n");
        for(int int_max=10,i=int_max; i>=1; i--){
            for(int l=1; l<=(i-1); l++){
                System.out.print("-");
            }
            for(int l=0; l<=(int_max-i); l++){
                System.out.print("X");
            }
            System.out.format("%n");
        }
    }
}