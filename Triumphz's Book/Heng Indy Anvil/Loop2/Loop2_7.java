public class Loop2_7 {
    public static void main(String[] args) {
        System.out.println("===== SIX =====");
        System.out.format("พิมพ์ ----------1%n---------121%n--------12321%n-------1234321 10 บรรทัด%n");
        for(int int_max=10,i=int_max; i>=1; i--){
            for(int l=1; l<=i; l++){
                System.out.print("-");
            }
            for(int x=0; x<=int_max-i; x++){
                System.out.print(x+1);
            }
            for(int x=int_max-i; x>0; x--){
                System.out.print(x);
            }
            System.out.format("%n");
        }
    }
}