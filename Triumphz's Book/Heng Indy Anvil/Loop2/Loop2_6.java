public class Loop2_6 {
    public static void main(String[] args) {
        System.out.println("===== SIX =====");
        System.out.format("พิมพ์%n----------X%n---------XXX%n--------XXXXX 10 บรรทัด%n");
        int int_x = 1;
        for(int int_max=10,i=int_max; i>=1; i--){
            for(int l=1; l<=i; l++){
                System.out.print("-");
            }
            for(int x=1; x<=int_x; x++){
                System.out.print("X");
            }
            int_x+=2;
            System.out.format("%n");
        }
    }
}