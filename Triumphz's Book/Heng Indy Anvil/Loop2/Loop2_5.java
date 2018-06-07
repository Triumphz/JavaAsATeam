public class Loop2_5 {
    public static void main(String[] args) {
        System.out.println("===== FIVE =====");
        System.out.format("พิมพ์ ---------X%n--------XX%n...%nXXXXXXXXXX 10 บรรทัด%n");
        for(int max=10,i=max; i>=1; i--){
            for(int l=1; l<=(i-1); l++){
                System.out.print("-");
            }
            for(int l=0; l<=(max-i); l++){
                System.out.print("X");
            }
            System.out.format("%n");
        }
    }
}